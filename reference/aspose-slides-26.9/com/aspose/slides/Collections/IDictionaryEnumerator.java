package com.aspose.slides.Collections;

public interface IDictionaryEnumerator<T> extends IEnumerator<T> {
   DictionaryEntry getEntry();

   Object getKey();

   Object getValue();
}
