<#import "parts/common.ftl" as c>

<@c.page>
    <h5>Hello, guest</h5>
    <div>This is a simple clone off Twitter</div>
    <div class="text-center">
        <p class="font-weight-bold">${message?ifExists}</p>
    </div>
</@c.page>