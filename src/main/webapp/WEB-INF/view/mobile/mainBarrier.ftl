<h4 class="bs-callout-title-orange">${title}</h4>
<p>There are two mode pagelets: barrier & pipe in plumber. Both of them will be executed concurrently, but there are some differences between them.</p>
<p>Plumber will wait for all the barrier mode pagelets executed, then flush them as the first chunked response. </p>