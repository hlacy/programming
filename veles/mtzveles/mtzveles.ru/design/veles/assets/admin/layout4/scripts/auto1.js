$(function() {
	//  Автозаполнитель поиска
	$(".input_search").autocomplete({
		serviceUrl:'/ajax/search_products.php',
		minChars:1,
		noCache: false,
		onSelect:
			function(suggestion){
				 $(".input_search").closest('form').submit();
			},
		formatResult:
			function(suggestion, currentValue){
				var reEscape = new RegExp('(\\' + ['/', '.', '*', '+', '?', '|', '(', ')', '[', ']', '{', '}', '\\'].join('|\\') + ')', 'g');
				var pattern = '(' + currentValue.replace(reEscape, '\\$1') + ')';
				return (suggestion.data.image?"<div class='image pull-left'><img align=absmiddle src='"+suggestion.data.image+"'></div> ":'') + suggestion.value.replace(new RegExp(pattern, 'gi'), '<strong>$1<\/strong>');
			}
	});
});