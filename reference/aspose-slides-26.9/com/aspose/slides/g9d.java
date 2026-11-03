package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

class g9d {
   private e9j n5;
   private com.aspose.slides.internal.z0k.n5 l6;
   private com.aspose.slides.internal.o9b.y2 k5 = new com.aspose.slides.internal.o9b.y2(0, 0, 0, 0);
   private String u3 = null;
   private com.aspose.slides.internal.k0r.m7 a6;

   g9d(e9j var1, com.aspose.slides.internal.z0k.n5 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   final void n5(com.aspose.slides.internal.k0r.z6z var1) {
      switch (var1.u3()) {
         case 61455:
            com.aspose.slides.internal.k0r.v7 var3 = new com.aspose.slides.internal.k0r.v7();
            var3.n5(this.l6, var1);
            this.k5 = new com.aspose.slides.internal.o9b.y2(this.n5.n5(var3.u9().a6().k5()).k5(), var3.u9().h0().u3());
            break;
         case 61456:
            com.aspose.slides.internal.k0r.t7 var2 = new com.aspose.slides.internal.k0r.t7();
            var2.n5(this.l6, var1);
            this.k5 = new com.aspose.slides.internal.o9b.y2(var2.u9().a6().k5(), var2.u9().h0().u3());
      }
   }

   final void l6(com.aspose.slides.internal.k0r.z6z var1) {
      g4x var2 = new g4x(var1, this.l6);

      try {
         com.aspose.slides.internal.k0r.z6z var3 = var2.n5(com.aspose.slides.internal.v6g.k5.k5(3011, 9));
         if (var3 != null) {
            this.a6 = new com.aspose.slides.internal.k0r.m7();
            this.a6.n5(this.l6, var3);
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   final void n5(com.aspose.slides.internal.k0r.z6z var1, List<com.aspose.slides.internal.k0r.e6r> var2) {
      g4x var3 = new g4x(var1, this.l6);

      try {
         com.aspose.slides.internal.k0r.z6z var4 = var3.l6();

         while (var4 != null) {
            switch (var4.u3()) {
               case 3998:
                  com.aspose.slides.internal.k0r.g9 var10 = new com.aspose.slides.internal.k0r.g9(null);
                  var10.n5(this.l6, var4);
                  if (var10.l6() >= var2.size()) {
                     throw new IndexOutOfRangeException("No outlined text!");
                  }

                  com.aspose.slides.internal.k0r.e6r var11 = (com.aspose.slides.internal.k0r.e6r)var2.get_Item(var10.l6());
                  if (com.aspose.slides.internal.v6g.k5.k5(var11.r4(), 8) == 4000) {
                     this.u3 = ((com.aspose.slides.internal.k0r.x1f)var11).l6();
                  } else {
                     this.u3 = ((com.aspose.slides.internal.k0r.k2p)var11).l6();
                  }

                  return;
               case 4000:
                  com.aspose.slides.internal.k0r.x1f var6 = new com.aspose.slides.internal.k0r.x1f(null);
                  var6.n5(this.l6, var4);
                  this.u3 = var6.l6();
                  return;
               case 4008:
                  com.aspose.slides.internal.k0r.k2p var5 = new com.aspose.slides.internal.k0r.k2p(null);
                  var5.n5(this.l6, var4);
                  this.u3 = var5.l6();
                  return;
               default:
                  var4 = var3.l6();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   final int n5(boolean var1) {
      if (var1) {
         this.u3 = com.aspose.slides.internal.n8e.w1.n5(this.u3);
      }

      int var2 = 0;
      int var3 = -1;
      int var4 = this.k5.t2();
      String[] var5 = com.aspose.slides.ms.System.d1.n5(this.n5(), new char[]{' ', '\r', '\u000b'}, (short)1);
      if (var5.length == 0) {
         return -1;
      }

      for (String var9 : var5) {
         if (var2 < var9.length()) {
            var2 = var9.length();
         }
      }

      if (var2 > 0) {
         var3 = var4 / var2;
      }

      return var3;
   }

   final String n5() {
      return this.u3;
   }

   final com.aspose.slides.internal.o9b.j5 l6() {
      return this.k5.a6();
   }

   final boolean k5() {
      return this.a6 != null && this.a6.l6() >= 0;
   }
}
