<#import "/lib/demo/common.ftl" as com />
<#import "/lib/demo/qcsyksh.ftl" as lib />
<#escape x as (x)!>
    <#compress>
        <@com.indexHeader projectName="DEMO" title="汽车使用可视化 - DEMO - 索米科技" selected="INDEX" />
        <@com.left selected="QCSYKSH" />
        <@lib.content />
        <@com.indexFooter />
    </#compress>
</#escape>