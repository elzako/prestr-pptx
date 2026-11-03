package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class l6$n5 {
   protected y2 n5;
   protected boolean l6;
   private n5 u3;
   private n5 a6;
   protected l6 k5;

   public l6$n5(l6 var1) {
      this.k5 = var1;
   }

   public final void n5(List<c8> var1, boolean var2, boolean var3, boolean var4) {
      for (int var5 = 0; var5 < var1.size(); var5++) {
         m3 var6 = com.aspose.slides.internal.u6.l6.n5(this.k5).u9(var5);
         ((c8)var1.get_Item(var5)).n5(0, var6, var2, var3, var4);
      }

      com.aspose.slides.internal.u6.l6.n5(this.k5, false);
   }

   public final void n5(List<c8> var1, List<c8> var2) {
      for (int var3 = 0; var3 < var2.size(); var3++) {
         c8 var4 = (c8)var2.get_Item(var3);
         if (var4.t2() == 0) {
            c8 var5 = (c8)var1.get_Item(var3);
            var4.n5(var5, 0);
         }
      }
   }

   public final void l6(List<c8> var1, boolean var2, boolean var3, boolean var4) {
      if (var1 != null) {
         for (int var5 = 0; var5 < var1.size(); var5++) {
            ((c8)var1.get_Item(var5)).n5(1, this.n5, var2, var3, var4);
         }
      }
   }

   public final void k5(List<c8> var1, boolean var2, boolean var3, boolean var4) {
      if (var1 != null) {
         for (int var5 = 0; var5 < var1.size(); var5++) {
            m3 var6 = com.aspose.slides.internal.u6.l6.n5(this.k5).u9(var5);
            ((c8)var1.get_Item(var5)).n5(1, var6, var2, var3, var4);
         }
      }
   }

   public final void n5(List<c8> var1) {
      for (int var2 = 0; var2 < com.aspose.slides.internal.u6.l6.n5(this.k5).v4(); var2++) {
         c8 var3 = (c8)var1.get_Item(var2);
         u3 var4 = (u3)com.aspose.slides.internal.u6.l6.l6(this.k5).get_Item(var2);
         var3.n5(0, var4, false, true, true);
      }
   }

   public final void l6(List<c8> var1) {
      for (int var2 = 0; var2 < com.aspose.slides.internal.u6.l6.n5(this.k5).v4(); var2++) {
         c8 var3 = (c8)var1.get_Item(var2);
         u3 var4 = (u3)com.aspose.slides.internal.u6.l6.k5(this.k5).get_Item(var2);
         var3.n5(1, var4, false, true, true);
      }
   }

   public final void n5(y2 var1) {
      this.n5 = var1;
      this.l6 = true;
      this.u3 = com.aspose.slides.internal.u6.l6.u3(this.k5).n5(com.aspose.slides.internal.u6.l6.n5(this.k5).y4, this.n5.y4);
      this.a6 = com.aspose.slides.internal.u6.l6.u3(this.k5).n5(com.aspose.slides.internal.u6.l6.n5(this.k5).e2, this.n5.e2);
   }

   public void n5(List<c8> var1, k7 var2) {
      n5 var3 = this.u3;
      n5 var4 = this.a6;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, y1.class)) {
         y1 var5 = (y1)var2;
         List$Enumerator var6 = var1.iterator();

         try {
            while (var6.hasNext()) {
               c8 var7 = (c8)var6.next();
               boolean var8 = var7.t2() == 0;
               boolean var9 = var7.a6();
               var7.n5(0, var5, var8, var8, true);
               var7.n5(1, var5, var9, var9, true);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         var3 = com.aspose.slides.internal.u6.l6.u3(this.k5).n5(var3, var5.y4);
         var4 = com.aspose.slides.internal.u6.l6.u3(this.k5).n5(var4, var5.e2);
      }

      if (this.l6) {
         for (int var13 = 0; var13 < var1.size(); var13++) {
            ((c8)var1.get_Item(var13)).n5(0, this.n5, true, true, true);
         }

         this.l6 = false;
      }

      com.aspose.slides.internal.r4.u3 var14 = new com.aspose.slides.internal.r4.u3(var1);
      c8 var15 = (c8)var14.k5();
      com.aspose.slides.internal.r4.u3 var16 = new com.aspose.slides.internal.r4.u3<>(com.aspose.slides.internal.u6.l6.n5(this.k5).z7());
      m3 var17 = (m3)var16.k5();
      var15.n5(2, var17);
      var15.n5(2, var3);

      while (var14.l6()) {
         c8 var18 = (c8)var14.k5();
         m3 var10 = (m3)var16.k5();
         if (var15.u3()) {
            var15.n5(3, var17);
            var18.n5(2, var10);
            var15.n5(var18, 3);
         }

         var15 = var18;
         var17 = var10;
      }

      var15.n5(3, var17);
      var15.n5(3, var4);
   }

   public void n5() {
      this.l6(com.aspose.slides.internal.u6.l6.a6(this.k5), true, true, true);
   }

   public abstract void l6();
}
