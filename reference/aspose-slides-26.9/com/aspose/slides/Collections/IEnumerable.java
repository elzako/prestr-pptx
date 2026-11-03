package com.aspose.slides.Collections;

public interface IEnumerable<T> extends Iterable<T> {
   IEnumerator<T> iterator();
}
