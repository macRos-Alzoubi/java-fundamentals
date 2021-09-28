javaScriptLinter method should give you an error message 
containing the line number and an error description.

but note that it will not give you error in the listed cases:
- Don’t show an error if the line is empty.
- Don’t show an error if the line ends with an opening curly brace {
- Don’t show an error if the line ends with an closing curly brace }
- Don’t show an error if the line contains if or else