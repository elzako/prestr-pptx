package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class b6z implements IGenericEnumerable<l4a> {
   private String n5 = com.aspose.slides.ms.System.d1.n5(new String[]{
      "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><table xmlns=\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\" totalsRowShown=\"0\">",
      "<tableColumns/><tableStyleInfo showFirstColumn=\"0\" showLastColumn=\"0\" showRowStripes=\"1\" showColumnStripes=\"0\" /></table>"
   });
   private final List<l4a> l6 = new List<>();
   private final ChartDataWorksheet k5;

   public final int n5() {
      return this.l6.size();
   }

   b6z(ChartDataWorksheet var1) {
      this.k5 = var1;
   }

   final void n5(l4a var1) {
      this.l6.addItem(var1);
   }

   @Override
   public final IGenericEnumerator<l4a> iterator() {
      return this.l6.iterator();
   }

   public final l4a l6() {
      l4a var1 = new l4a(this.k5);
      long var2 = this.l6.size() & 4294967295L;
      boolean var4 = true;

      while (var4) {
         var2++;
         var4 = false;
         List$Enumerator var5 = this.l6.iterator();

         try {
            while (var5.hasNext()) {
               l4a var6 = (l4a)var5.next();
               if (com.aspose.slides.ms.System.d1.a6(var6.u9().k5(), com.aspose.slides.ms.System.d1.n5(new String[]{"Table", com.aspose.slides.ms.System.l4.l6(var2)}))
                  || com.aspose.slides.ms.System.d1.a6(var6.u9().l6(), com.aspose.slides.ms.System.d1.n5(new String[]{"Table", com.aspose.slides.ms.System.l4.l6(var2)}))
                  || var6.u9().n5() == var2) {
                  var4 = true;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      var1.u9().l6(com.aspose.slides.ms.System.d1.n5(new String[]{"Table", com.aspose.slides.ms.System.l4.l6(var2)}));
      var1.u9().n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Table", com.aspose.slides.ms.System.l4.l6(var2)}));
      var1.u9().n5(var2);
      var1.u9().n5(new com.aspose.slides.internal.k4y.p9l());
      var1.u9().n5(new com.aspose.slides.internal.k4y.h5c());
      var1.u9().w1().n5((byte)0);
      var1.u9().w1().l6((byte)0);
      var1.u9().w1().k5((byte)1);
      var1.u9().w1().u3((byte)0);
      this.l6.addItem(var1);
      return var1;
   }

   final l4a n5(String var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            l4a var3 = (l4a)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(var3.u9().l6(), var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }
}
