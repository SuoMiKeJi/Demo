<#import "/lib/demo/common.ftl" as com />
<#import "/lib/demo/jsxwfx.ftl" as lib />
<#escape x as (x)!>
    <#compress>
        <@com.indexHeader projectName="DEMO" title="驾驶行为分析 - DEMO - 索米科技" selected="INDEX" />
        <@com.left selected="JSXWFX" />
        <@lib.content />
        <@com.indexFooter />
    </#compress>
</#escape>