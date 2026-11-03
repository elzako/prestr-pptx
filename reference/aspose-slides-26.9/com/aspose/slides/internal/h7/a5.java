package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class a5 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final Stack<com.aspose.slides.internal.e7.t2> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("DeviceRGB", "DeviceCMYK", "DeviceGray");

   public a5(com.aspose.slides.internal.t8.l6 var1, Stack<com.aspose.slides.internal.e7.t2> var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
      com.aspose.slides.internal.e7.t2 var4 = this.l6.peek();
      switch (k5.n5(var3.y1())) {
         case 0:
            this.n5(com.aspose.slides.internal.g9.n3.n5, var1, var2);
            return;
         case 1:
            this.n5(com.aspose.slides.internal.g9.c8.n5, var1, var2);
            return;
         case 2:
            this.n5(com.aspose.slides.internal.g9.s7.n5, var1, var2);
            return;
         default:
            if (var4.n5() != null && var4.n5().containsKey(var3.y1())) {
               com.aspose.slides.internal.g9.a6 var5 = var4.n5().get_Item(var3.y1());
               this.n5(var5, var1, var2);
            }
      }
   }

   private void n5(com.aspose.slides.internal.g9.a6 var1, m1 var2, List<com.aspose.slides.internal.v2.s7> var3) {
      if (var1 != null) {
         t9 var4 = null;
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.s7.class)) {
            var4 = new f0(this.n5);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.n3.class)) {
            var4 = new y0(this.n5);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.c8.class)) {
            var4 = new t1(this.n5);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.y4.class)) {
            var4 = new a3(this.n5);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.k5.class)) {
            var4 = new u6(this.n5);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.t4.class)) {
            var4 = new j9(this.n5, this.l6);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.x8.class)) {
            var4 = new v0(this.n5);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.z1.class)) {
            var4 = new x9(this.n5, this.l6);
         } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.e2.class)
            && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g9.t9.class)) {
            var4 = new p3(this.n5);
         }

         if (var4 != null) {
            var4.n5(var2, var3);
         }
      }
   }
}
