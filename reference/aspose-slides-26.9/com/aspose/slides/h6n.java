package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;

class h6n implements IGenericEnumerable<x6u> {
   SortedList<String, x6u> n5;
   private Dictionary<String, String> l6;
   private static final Dictionary<String, String> k5 = new Dictionary<>(0);
   private static final char[] u3 = new char[]{'/'};
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("TargetMode", "Target", "Type", "Id");

   @Override
   public final IGenericEnumerator<x6u> iterator() {
      return new h6n$n5(this);
   }

   // $VF: synthetic method
   static Dictionary n5(h6n var0) {
      return var0.l6;
   }
}
