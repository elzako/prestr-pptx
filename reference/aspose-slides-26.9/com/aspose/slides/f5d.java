package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;

class f5d extends com.aspose.slides.ms.System.Xml.k1 {
   private SortedList<String, byte[]> n5 = new SortedList<>();

   public f5d(SortedList<String, byte[]> var1) {
      this.n5 = new SortedList<>(var1);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.r8 var1, String var2, com.aspose.slides.ms.System.y8 var3) {
      if (var1 != null && this.n5.containsKey(var1.l6())) {
         try {
            return new com.aspose.slides.internal.z0k.e2(com.aspose.slides.internal.v6g.k5.k5(this.n5.get_Item(var1.l6()), byte[].class), false);
         } catch (RuntimeException var5) {
            com.aspose.slides.internal.n8e.v4.n5(var5);
            return null;
         }
      } else {
         return null;
      }
   }
}
