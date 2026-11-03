package com.aspose.slides;

import java.awt.Color;
import java.util.regex.Pattern;

/** Editable paragraph container; change formatting through the local format objects. */
public interface ITextFrame extends ISlideComponent {
   IParagraphCollection getParagraphs();

   String getText();

   void setText(String value);

   ITextFrameFormat getTextFrameFormat();

   IHyperlinkQueries getHyperlinkQueries();

   IShape getParentShape();

   ICell getParentCell();

   void joinPortionsWithSameFormatting();

   void highlightText(String text, Color highlightColor);

   String[] splitTextByColumns();

   @Deprecated
   void highlightText(String text, Color highlightColor, ITextHighlightingOptions options);

   void highlightText(String text, Color highlightColor, ITextSearchOptions options, IFindResultCallback callback);

   void highlightRegex(Pattern pattern, Color highlightColor, IFindResultCallback callback);

   @Deprecated
   void highlightRegex(String pattern, Color highlightColor, ITextHighlightingOptions options);

   void replaceText(String oldText, String newText, ITextSearchOptions options, IFindResultCallback callback);

   void replaceRegex(Pattern pattern, String replacement, IFindResultCallback callback);
}
