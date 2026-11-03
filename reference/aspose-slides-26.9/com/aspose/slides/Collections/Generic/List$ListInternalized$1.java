package com.aspose.slides.Collections.Generic;

import com.aspose.slides.ms.System.z1;
import java.util.Comparator;

class List$ListInternalized$1<T> implements Comparator<T> {
   // $VF: synthetic field
   final z1 n5;
   // $VF: synthetic field
   final List$ListInternalized l6;

   List$ListInternalized$1(List$ListInternalized this$0, z1 var2) {
      this.l6 = this$0;
      this.n5 = var2;
   }

   @Override
   public int compare(T o1, T o2) {
      return this.n5.n5(o1, o2);
   }
}
