﻿ 
import { Component } from '@angular/core';

import { jqxTreeGridComponent } from '../../../../../jqwidgets-ts/angular_jqxtreegrid';

@Component({
    selector: 'my-app',
    template:
        `<jqxTreeGrid
            [width]='850' [pageable]='true' [altRows]='true' [columns]='columns'
            [virtualModeCreateRecords]='virtualModeCreateRecords' [virtualModeRecordCreating]='virtualModeRecordCreating' >
        </jqxTreeGrid>`
})

export class AppComponent
{
    generateTasks(rowsCount?: number): any[]
    {
        rowsCount === undefined ? rowsCount = rowsCount = 1 + Math.floor(Math.random() * 5) : rowsCount = rowsCount


        let data = [];
        let generatekey = (): any => 
        {
            let S4 = (): any =>
            {
                return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
            };
            return (S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4());
        };
        for (let i = 0; i < rowsCount; i++)
        {
            let row = {};
            let tasks =
                [
                    "Shopping", "Housewares", "Kitchen supplies", "Groceries", "Cleaning supplies", "Office supplies", "Remodeling", "Paint bedroom", "Paint wall", "Fitness", "Decorate living room", "Fix lights", "Fix front door", "Clean kitchen"
                ];
            let firstNames =
                [
                    "Andrew", "Nancy", "Shelley", "Regina", "Yoshi", "Antoni", "Mayumi", "Ian", "Peter", "Lars", "Petra", "Martin", "Sven", "Elio", "Beate", "Cheryl", "Michael", "Guylene"
                ];
            let lastNames =
                [
                    "Fuller", "Davolio", "Burke", "Murphy", "Nagase", "Saavedra", "Ohno", "Devling", "Wilson", "Peterson", "Winkler", "Bein", "Petersen", "Rossi", "Vileid", "Saylor", "Bjorn", "Nodier"
                ];
            row["id"] = generatekey();
            row["firstname"] = firstNames[Math.floor(Math.random() * firstNames.length)];
            row["lastname"] = lastNames[Math.floor(Math.random() * lastNames.length)];
            row["name"] = row["firstname"] + " " + row["lastname"];
            let taskindex = Math.floor(Math.random() * tasks.length);
            row["task"] = tasks[taskindex];
            row["duration"] = 1 + Math.floor(Math.random() * 10);
            data.push(row);
        }
        return data;
    }

    virtualModeCreateRecords: any = (expandedRecord: any, done: any): void =>
    {
        let source =
            {
                dataType: "array",
                dataFields: [
                    { name: "id", type: "string" },
                    { name: "name", type: "string" },
                    { name: "duration", type: "number" },
                    { name: "task", type: "number" }
                ],
                localData: expandedRecord === null ? this.generateTasks(3000) : this.generateTasks(),
                id: 'id'
            }
        let dataAdapter = new $.jqx.dataAdapter(source,
            {
                loadComplete: (): void =>
                {
                    done(dataAdapter.records);
                }
            });
        dataAdapter.dataBind();
    };

    virtualModeRecordCreating: any = (record: any): void =>
    {
        if (record.level == 2)
        {
            record.leaf = true;
        }
    };

    columns: any[] =
    [
        {
            text: 'Task', dataField: "task", align: 'center', width: 300
        },
        {
            text: 'Person Name', dataField: "name", cellsAlign: 'center', align: 'center', width: 300
        },
        {
            text: 'Duration', aggregates: ['sum'], dataField: "duration", cellsAlign: 'center', align: 'center',
            cellsRenderer: (row: string, column: string, value: number): string =>
            {
                let hour = value > 1 ? " hours" : " hour";
                return value + hour;
            }
        }
    ];
}
