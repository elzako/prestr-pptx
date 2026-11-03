package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class x4 {
   private x4 n5;
   private Object l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private String u9;
   private List<x4> h0;

   x4(x4 var1, Object var2) {
      this.n5(var1);
      this.n5(var2);
      this.n5(new List<>());
   }

   x4(ChartCategoryCollection var1, x4 var2, int var3, int var4, int var5) {
      this.n5(new List<>());
      this.n5(var2);
      this.n5((Object)(((ChartCategory)var1.get_Item(var4)).k5().n5(var3 + 1) == null ? "" : ((ChartCategory)var1.get_Item(var4)).k5().n5(var3 + 1).toString()));
      if (var3 != -1) {
         if (var3 != 0) {
            Object var10 = ((ChartCategory)var1.get_Item(var4)).k5().n5(var3);
            int var7 = var4;

            for (int var8 = var4; var8 < var5; var8++) {
               Object var9 = ((ChartCategory)var1.get_Item(var8)).k5().n5(var3);
               if (var10 != null && var9 != null && !com.aspose.slides.ms.System.d1.a6(var10.toString(), var9.toString()) && !"".equals(var9.toString())) {
                  this.h0().addItem(new x4(var1, this, var3 - 1, var7, var8));
                  var10 = var9;
                  var7 = var8;
               }
            }

            if (var10 != null && !"".equals(var10.toString())) {
               x4 var11 = new x4(var1, this, var3 - 1, var7, var5);
               this.h0().addItem(var11);
            }
         } else {
            for (int var6 = var4; var6 < var5; var6++) {
               this.h0().addItem(new x4(var1, this, var3 - 1, var6, var6));
            }
         }
      }
   }

   public final x4 n5() {
      return this.n5;
   }

   public final void n5(x4 var1) {
      this.n5 = var1;
   }

   public final Object l6() {
      return this.l6;
   }

   public final void n5(Object var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final boolean a6() {
      return this.a6;
   }

   public final void l6(boolean var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   public final List<x4> h0() {
      return this.h0;
   }

   public final void n5(List<x4> var1) {
      this.h0 = var1;
   }
}
