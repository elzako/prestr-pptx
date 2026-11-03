package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class k6 extends z6 {
   private List<j8> k5 = new List<>();
   private List<j8> u3 = new List<>();
   private List<j8> a6 = new List<>();
   private List<j8> u9 = new List<>();
   private List<j8> h0 = new List<>();
   private j8 c8;
   private j8 t2;
   private j8 s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml",
      "application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml",
      "application/vnd.openxmlformats-officedocument.vmlDrawing"
   );

   public final j8[] y4() {
      return this.k5.toArray(new j8[0]);
   }

   public final List<j8> e2() {
      return this.h0;
   }

   public final j8 t9() {
      return this.c8;
   }

   public final j8 z1() {
      return this.t2;
   }

   public final j8 t4() {
      return this.s7;
   }

   public k6() {
      this.x8();
   }

   public k6(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      this.l6(var1, var2, com.aspose.slides.internal.b8.c8.n5);
   }

   @Override
   public void n5(IGenericList<j8> var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            j8 var3 = (j8)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (this.h0.size() == 0) {
         IGenericEnumerator var12 = var1.iterator();

         try {
            while (var12.hasNext()) {
               j8 var4 = (j8)var12.next();
               if ("/theme/theme/theme1.xml".equals(var4.l6())) {
                  this.c8 = var4;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }
      } else if (this.h0.size() > 1) {
         for (int var13 = 0; var13 < this.h0.size(); var13++) {
            if (!com.aspose.slides.ms.System.d1.t2(this.h0.get_Item(var13).l6(), "variant")) {
               this.h0.insertItem(0, this.h0.get_Item(var13));
               this.h0.removeAt(var13 + 1);
               break;
            }
         }
      }
   }

   @Override
   public void n5(j8 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), r4.class)) {
         switch (x8.n5(var1.y4().n5())) {
            case 0:
               this.u3.addItem(var1);
               break;
            case 1:
               this.k5.addItem(var1);
               break;
            case 2:
               this.u9.addItem(var1);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), r6.class)) {
            this.h0.addItem(var1);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), y8.class)) {
         this.a6.addItem(var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), t0.class)) {
         this.t2 = var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.y4(), n6.class)) {
         this.s7 = var1;
      } else if (var1.y4() == null) {
         var1.l6(new n8());
      }
   }
}
