<#import "/lib/demo/common.ftl" as com />
<#import "/lib/demo/index.ftl" as lib />
<#escape x as (x)!>
    <#compress>
        <@com.indexHeader projectName="DEMO" title="首页 - DEMO - 索米科技" selected="INDEX" />
            <@com.left selected="INDEX" />
            <@lib.content />
        <@com.indexFooter />
    </#compress>
</#escape>