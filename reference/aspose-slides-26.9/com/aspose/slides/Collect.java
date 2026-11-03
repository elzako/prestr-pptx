package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;

public class Collect {
   public static IGenericEnumerable<Shape> shapes(Presentation pres) {
      List var1 = new List();
      ForEach.shape(pres, new Collect$1(var1));
      return var1;
   }
}
