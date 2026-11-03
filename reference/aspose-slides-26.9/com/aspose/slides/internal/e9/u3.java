package com.aspose.slides.internal.e9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.d2.s7;
import com.aspose.slides.internal.e1.a0;
import com.aspose.slides.internal.e1.c8;
import com.aspose.slides.internal.e1.s3;
import com.aspose.slides.internal.e1.t9;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.e1.x8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class u3 extends k5 {
   private t9 m3 = null;
   private int z8 = 39;

   public u3(com.aspose.slides.internal.y1.u3 var1, List<w1> var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public String c8() {
      return "application/X-fop-ex-aps";
   }

   private com.aspose.slides.internal.o9b.w1 z3() {
      return new com.aspose.slides.internal.o9b.w1(this.u3 / 1000.0F, this.k5.n5() / 1000.0F);
   }

   private static f2 l6(s7 var0) {
      return new f2(
         com.aspose.slides.internal.v6g.k5.u3(var0.a6(48), int.class).intValue() / 1000.0F,
         com.aspose.slides.internal.v6g.k5.u3(var0.a6(49), int.class).intValue() / 1000.0F
      );
   }

   private com.aspose.slides.internal.p1s.l6 k5(s7 var1) {
      if (var1.u9(3)) {
         com.aspose.slides.internal.v0.s7 var2 = (com.aspose.slides.internal.v0.s7)var1.a6(3);
         int var3 = com.aspose.slides.internal.v6g.k5.u3(var1.a6(4), int.class);
         com.aspose.slides.internal.v0.u3 var4 = this.x8.n5(var2, var3, var2.a6());
         return var4.k5();
      } else {
         return null;
      }
   }

   private void n5(int var1, com.aspose.slides.internal.o9b.w1 var2, f2 var3, com.aspose.slides.internal.p1s.l6 var4, String var5, float var6) {
      this.z8 = var1;
      var2 = new com.aspose.slides.internal.o9b.w1(var2.l6(), var6 - var3.k5() / 2.0F);
      switch (var1) {
         case 39:
            this.m3 = null;
            break;
         case 207:
            s3 var7 = new s3(var2.u3(), var5, var3.a6(), false);
            var7.n5(var4);
            this.m3 = var7;
            break;
         case 208:
            this.m3 = new com.aspose.slides.internal.e1.s7(var2.u3(), var5, 10.0F);
            break;
         case 209:
            this.m3 = new a0(var2.u3(), var5, 10.0F);
            break;
         case 210:
            x8 var9 = new x8(var2.u3(), var5, new List<>(), 0);
            var9.n5(var4);
            var9.n5(var3.a6());
            this.m3 = var9;
            break;
         case 212:
            if (var3.k5() == 0.0F) {
               this.m3 = null;
            } else {
               c8 var8 = new c8(var2.u3(), var5, var3.a6());
               var8.n5(var4);
               this.m3 = var8;
            }
      }

      if (this.m3 != null) {
         this.t4().n5(this.m3);
      }
   }

   private static String u3(List<com.aspose.slides.internal.d2.c8> var0) {
      a5 var1 = new a5();
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.d2.c8 var3 = (com.aspose.slides.internal.d2.c8)var2.next();
            com.aspose.slides.internal.d2.t9 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.d2.t9.class);
            if (var4 != null) {
               var1.n5(var4.a0());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   private static boolean u3(s7 var0) {
      return var0.u9(51) && (Integer)var0.a6(51) == 149;
   }

   @Override
   protected void n5(s7 var1) {
      String var2 = this.l6((com.aspose.slides.internal.a0.l6)var1);
      new y1();
      float var4 = 0.0F;
      y1 var3 = new y1(this.u3 / 1000.0F, this.k5.n5() / 1000.0F, var1.l6() / 1000.0F, var1.e_() / 1000.0F);
      com.aspose.slides.internal.w0.c8 var5 = new com.aspose.slides.internal.w0.c8();
      var5.l6(0.0F, var1.w1() / 1000.0F);
      var5.n5(var3.y4()).a6(var3);
      var4 = var3.t2() + var3.k5() / 2.0F;
      this.n5(var2, var3.y4());

      try {
         if (var1.u9(46)) {
            int var6 = (Integer)var1.a6(46);
            if (var6 == 39) {
               this.m3 = null;
               this.z8 = var6;
            } else if (var6 != 214 && (this.m3 == null || !d1.a6(this.m3.j5(), var2))) {
               this.n5(var6, this.z3().u3(), l6(var1).a6(), this.k5(var1), this.l6((com.aspose.slides.internal.a0.l6)var1), var4);
               if (this.m3 != null) {
                  this.m3.k5(var2);
               }
            }
         }

         if (var1.u9(50) && (Integer)var1.a6(50) == 149) {
            switch (this.z8) {
               case 207:
                  s3 var9 = com.aspose.slides.internal.v6g.k5.n5(this.m3, s3.class);
                  if (var9 != null) {
                     if (d1.n5(var9.k5())) {
                        var9.n5(u3(var1.x8));
                     } else {
                        var9.n5(d1.n5(new String[]{var9.k5(), d1.n5(new Object[]{'\n', u3(var1.x8)})}));
                     }
                  }
               case 208:
               case 211:
               default:
                  break;
               case 209:
                  a0 var8 = com.aspose.slides.internal.v6g.k5.n5(this.m3, a0.class);
                  if (var8 != null) {
                     var8.l6(u3(var1.x8));
                  }
                  break;
               case 210:
                  x8 var14 = com.aspose.slides.internal.v6g.k5.n5(this.m3, x8.class);
                  if (var14 != null) {
                     if (var14.l6() == null) {
                        var14.n5(new List<>());
                     }

                     String var16 = u3(var1.x8);
                     if (d1.a6(var16, "@{EMPTY_VALUE}")) {
                        var16 = d1.n5;
                     }

                     var14.l6().addItem(var16);
                     if (u3(var1)) {
                        var14.n5(var14.l6().size() - 1);
                     }
                  }
                  break;
               case 212:
                  c8 var7 = com.aspose.slides.internal.v6g.k5.n5(this.m3, c8.class);
                  if (var7 != null) {
                     var7.n5(u3(var1.x8));
                  }
            }
         }

         if (u3(var1)) {
            switch (this.z8) {
               case 208:
                  com.aspose.slides.internal.e1.s7 var17 = com.aspose.slides.internal.v6g.k5.n5(this.m3, com.aspose.slides.internal.e1.s7.class);
                  if (var17 != null) {
                     var17.n5(true);
                  }
                  break;
               case 209:
                  a0 var15 = com.aspose.slides.internal.v6g.k5.n5(this.m3, a0.class);
                  if (var15 != null) {
                     var15.n5(true);
                  }
            }
         }

         if (var1.u9(46) && com.aspose.slides.internal.v6g.k5.u3(var1.a6(46), int.class) == 214) {
            this.l6();
            super.n5(var1);
            this.m3.n5(this.t4());
            this.k5();
            this.t4().l6(this.m3.t2());
         } else {
            super.n5(var1);
         }
      } finally {
         this.z1();
      }
   }
}
