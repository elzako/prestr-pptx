package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class v8p extends x0q {
   public v8p(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public v8p(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }

   final void n5(ISensitivityLabelCollection var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "labelList".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.s9c var2 = new com.aspose.slides.internal.k4y.s9c(this.s7());

            for (com.aspose.slides.internal.k4y.p1s var6 : var2.l6()) {
               ISensitivityLabel var7 = var1.add(var6.n5(), com.aspose.slides.ms.System.o0.n5(var6.u3()), var6.l6(), this.n5(var6.k5()));
               List$Enumerator var8 = n5(var6.a6()).iterator();

               try {
                  while (var8.hasNext()) {
                     int var9 = com.aspose.slides.internal.v6g.k5.u3(var8.next(), int.class);
                     var7.getContentMarkTypes().addItem(var9);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }

               var7.setRemoved(var6.u9());
            }

            ((SensitivityLabelCollection)var1).n5(var2.k5());
         }
      }

      this.n3();
   }

   final void l6(ISensitivityLabelCollection var1) {
      this.y4();
      com.aspose.slides.internal.k4y.s9c var2 = new com.aspose.slides.internal.k4y.s9c();
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            ISensitivityLabel var4 = (ISensitivityLabel)var3.next();
            com.aspose.slides.internal.k4y.p1s var5 = var2.n5();
            var5.n5(var4.getId());
            var5.n5(((SensitivityLabel)var4).n5().k5());
            var5.n5(var4.isEnabled());
            var5.l6(var4.getAssignmentMethodType() == 1 ? "Privileged" : "Standard");
            var5.n5(this.n5(var4.getContentMarkTypes()));
            var5.l6(var4.isRemoved());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      com.aspose.slides.internal.k4y.h3k var9 = ((SensitivityLabelCollection)var1).n5();
      if (var9 != null) {
         var2.n5(var9);
      }

      var2.n5(null, this.x8(), "labelList");
      this.e2();
   }

   private int n5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return 0;
      } else {
         return "Privileged".equals(var1) ? 1 : 0;
      }
   }

   static List<Integer> n5(long var0) {
      List var2 = new List();
      if (var0 == 4294967295L) {
         return var2;
      }

      if ((var0 & 4294967295L) == 0L) {
         var2.addItem(0);
      }

      IEnumerator var3 = com.aspose.slides.ms.System.d5.getValues(com.aspose.slides.internal.v6g.k5.n5(SensitivityLabelContentType.class)).iterator();

      try {
         while (var3.hasNext()) {
            int var4 = com.aspose.slides.internal.v6g.k5.u3(var3.next(), 11);
            if (var4 != 0 && (var0 & var4 & 4294967295L & 4294967295L) != 0L) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      return var2;
   }

   private long n5(IGenericList<Integer> var1) {
      if (var1.size() == 0) {
         return 4294967295L;
      }

      long var2 = 0L;

      for (int var4 = 0; var4 < var1.size(); var4++) {
         var2 = (var2 | ((Integer)var1.get_Item(var4)).intValue() & 4294967295L) & 4294967295L;
      }

      return var2;
   }
}
