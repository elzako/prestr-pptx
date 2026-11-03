package com.aspose.slides;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

public interface IGenericCollection<T> extends IGenericEnumerable<T>, ICollection<T> {
   IGenericEnumerator<T> iteratorJava();
}
