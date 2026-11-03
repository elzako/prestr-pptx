package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;

public interface IGenericEnumerable<T> extends IEnumerable<T> {
   IGenericEnumerator<T> iterator();
}
