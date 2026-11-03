package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public interface IGenericEnumerator<T> extends IEnumerator<T>, IDisposable {
   @Override
   T next();
}
