package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.a0.c4;
import com.aspose.slides.internal.a0.d2;
import com.aspose.slides.internal.a0.d5;
import com.aspose.slides.internal.a0.r4;
import com.aspose.slides.internal.a0.y1;
import com.aspose.slides.internal.a0.y2;
import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public abstract class a6 implements x8 {
   protected com.aspose.slides.internal.y1.u3 l6 = null;
   protected m1 k5 = new m1(0);
   protected int u3 = 0;
   protected int a6 = 0;
   protected o5 u9;
   protected com.aspose.slides.internal.f2.u3 h0 = com.aspose.slides.internal.h2.m3.n5(com.aspose.slides.internal.h2.z8.n5(9, "AUTO"));
   protected static final com.aspose.slides.internal.f2.u3 c8 = com.aspose.slides.internal.h2.m3.n5(com.aspose.slides.internal.h2.z8.n5(9, "AUTO"));
   protected y1 t2;
   protected int s7 = 0;

   public a6(com.aspose.slides.internal.y1.u3 var1) {
      this.l6 = var1;
   }

   @Override
   public com.aspose.slides.internal.y1.u3 h0() {
      return this.l6;
   }

   @Override
   public abstract String c8();

   @Override
   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (this.l6 == null) {
         throw new InvalidOperationException("FOUserAgent has not been set on Renderer");
      }
   }

   @Override
   public void t2() {
   }

   @Override
   public final boolean s7() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.x7n.l6 var1) {
   }

   @Override
   public void n5(com.aspose.slides.internal.a0.z3 var1) {
   }

   protected final o5 x8() {
      return this.u9;
   }

   @Override
   public final void n5(o5 var1) {
   }

   @Override
   public void n5(c4 var1) {
   }

   @Override
   public void l6(o5 var1) {
      this.u9 = var1;

      try {
         r4 var2 = var1.a6();
         this.n5(var2);
      } finally {
         this.u9 = null;
      }
   }

   protected final void n5(r4 var1) {
      y1 var2 = var1.n5(57);
      if (var2 != null) {
         this.l6(var2);
      }

      var2 = var1.n5(61);
      if (var2 != null) {
         this.l6(var2);
      }

      var2 = var1.n5(59);
      if (var2 != null) {
         this.l6(var2);
      }

      var2 = var1.n5(56);
      if (var2 != null) {
         this.l6(var2);
      }

      var2 = var1.n5(58);
      if (var2 != null) {
         this.l6(var2);
      }
   }

   protected void l6(y1 var1) {
      this.k5.n5(0);
      this.u3 = 0;
      y2 var2 = var1.m1();
      this.n5(var1);
      this.n5(var2.y1(), var1.k7().y4());
      if (var2.d2() == 58) {
         this.t2 = var1;
         this.n5((com.aspose.slides.internal.a0.n3)var2);
         this.t2 = null;
      } else {
         this.n5(var2);
      }

      this.n3();
   }

   protected abstract void n5(com.aspose.slides.internal.a0.e2 var1, com.aspose.slides.internal.o9b.y1 var2);

   protected abstract void n3();

   protected void n5(y1 var1) {
   }

   protected final void n5(y2 var1) {
      this.n5((com.aspose.slides.internal.a0.t2)null, var1.a0());
   }

   protected final void n5(com.aspose.slides.internal.a0.n3 var1) {
      com.aspose.slides.internal.a0.c8 var2 = var1.w1();
      if (var2 != null) {
         this.n5(var2);
      }

      d2 var3 = var1.m1();
      if (var3 != null) {
         this.n5(var3);
      }

      com.aspose.slides.internal.a0.z8 var4 = var1.z8();
      if (var4 != null) {
         this.n5(var4);
      }

      com.aspose.slides.internal.a0.z1 var5 = var1.r4();
      if (var5 != null) {
         this.n5(var5);
      }
   }

   protected void n5(d2 var1) {
      List var2 = var1.c4();
      if (var2 != null) {
         this.n5((com.aspose.slides.internal.a0.t2)null, var2);
      }
   }

   protected void n5(com.aspose.slides.internal.a0.c8 var1) {
      List var2 = var1.c4();
      if (var2 != null) {
         this.n5((com.aspose.slides.internal.a0.t2)null, var2);
         com.aspose.slides.internal.a0.t2 var3 = var1.m1();
         if (var3 != null) {
            this.k5(var3);
         }
      }
   }

   protected void n5(com.aspose.slides.internal.a0.z1 var1) {
      this.k5.n5(this.k5.n5() + var1.k7());
      List var2 = var1.c4();
      if (var2 != null) {
         com.aspose.slides.internal.a0.t2 var3 = var1.m1();
         if (var3 != null) {
            this.k5(var3);
         }

         this.n5((com.aspose.slides.internal.a0.t2)null, var2);
      }
   }

   protected void n5(com.aspose.slides.internal.a0.z8 var1) {
      d5 var2 = null;
      List var3 = var1.m1();
      this.k5.l6();
      int var4 = this.k5.n5();
      int var5 = this.u3;

      for (int var6 = 0; var6 < var3.size(); var6++) {
         var2 = (d5)var3.get_Item(var6);
         int var7 = var2.h0();
         if (var7 < 0) {
            var7 = 0;
         }

         if ((var7 & 1) == 1) {
            this.u3 = this.u3 + var2.l6();
            this.u3 = this.u3 + var1.j5();
         }

         for (int var8 = 0; var8 < var2.m1(); var8++) {
            com.aspose.slides.internal.a0.j5 var9 = var2.t2(var8);
            if (var9 != null) {
               this.k5.n5(var4);
               if ((var7 & 1) == 1) {
                  this.u3 = this.u3 - var9.l6();
                  this.u3 = this.u3 - var1.j5();
               }

               this.n5(var9);
               if ((var7 & 1) == 0) {
                  this.u3 = this.u3 + var9.l6();
                  this.u3 = this.u3 + var1.j5();
               }
            }
         }

         this.u3 = var5;
         this.k5.n5(var4 + var2.m3());
         var4 = this.k5.n5();
      }

      this.k5.k5();
   }

   protected void n5(com.aspose.slides.internal.a0.j5 var1) {
      List var2 = var1.c4();
      if (var2 != null) {
         this.n5((com.aspose.slides.internal.a0.t2)null, var2);
      }
   }

   protected void n5(com.aspose.slides.internal.a0.t2 var1) {
   }

   protected void n5(com.aspose.slides.internal.a0.x8 var1, List<com.aspose.slides.internal.a0.l6> var2) {
      if (var1.m1() == 2) {
         int var3 = this.u3;
         this.k5.l6();
         com.aspose.slides.internal.o9b.y1 var4 = com.aspose.slides.internal.o9b.y1.n5.y4();
         if (var1.e5()) {
            var4 = new com.aspose.slides.internal.o9b.y1(var3, this.k5.n5(), var1.l6(), var1.e_());
         }

         com.aspose.slides.internal.a0.e2 var5 = var1.i1();
         this.u3 = 0;
         this.k5.n5(0);
         this.n5(var5, var4.y4());
         this.n5(var1);
         this.n5((com.aspose.slides.internal.a0.t2)var1, var2);
         this.n3();
         this.u3 = var3;
         this.k5.k5();
      } else {
         int var6 = this.u3;
         this.k5.l6();
         this.n5(var1);
         this.n5((com.aspose.slides.internal.a0.t2)var1, var2);
         this.u3 = var6;
         this.k5.k5();
         this.k5.n5(this.k5.n5() + var1.a6());
      }
   }

   protected abstract void l6(com.aspose.slides.internal.a0.t2 var1);

   protected void n5(com.aspose.slides.internal.a0.t2 var1, List<com.aspose.slides.internal.a0.l6> var2) {
      int var3 = this.u3;
      if (var1 != null && var1 != null && !var1.h0(32)) {
         this.k5.n5(this.k5.n5() + var1.c8());
      }

      int var4 = this.k5.n5();
      int var5 = this.u3;
      this.a6 = this.u3;

      for (int var6 = 0; var6 < var2.size(); var6++) {
         Object var7 = var2.get_Item(var6);
         if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.a0.t2.class)) {
            this.u3 = var5;
            this.u3 = this.u3 + ((com.aspose.slides.internal.a0.t2)var7).r4();
            this.a6 = var5;
            this.k5((com.aspose.slides.internal.a0.t2)var7);
            this.a6 = var5;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.a0.k7.class)) {
            com.aspose.slides.internal.a0.k7 var8 = (com.aspose.slides.internal.a0.k7)var7;
            if (var1 != null) {
               int var9 = var1.n3();
               int var10 = var1.y4();
               this.u3 = this.u3 + (var1.m3() - var9);
            }

            this.u3 = this.u3 + var8.m1();
            this.n5(var8);
            this.k5.n5(this.k5.n5() + var8.a6());
         }

         this.u3 = var3;
      }
   }

   protected void k5(com.aspose.slides.internal.a0.t2 var1) {
      com.aspose.slides.internal.f2.u3 var2 = (com.aspose.slides.internal.f2.u3)var1.a6(43);
      if (var2 != null) {
         this.h0 = var2;
      } else {
         this.h0 = c8;
      }

      var2 = (com.aspose.slides.internal.f2.u3)var1.a6(46);
      var2 = (com.aspose.slides.internal.f2.u3)var1.a6(47);
      List var3 = var1.c4();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.a0.x8.class)) {
         if (var3 != null) {
            this.n5((com.aspose.slides.internal.a0.x8)var1, var3);
         } else {
            if (var1.z1() != 57) {
               this.n5(var1);
            }

            this.k5.n5(this.k5.n5() + var1.a6());
         }
      } else if (var1.h0(31)) {
         this.l6(var1);
      } else {
         int var4 = this.u3;
         this.k5.l6();
         this.u3 = this.u3 + var1.y1();
         this.k5.n5(this.k5.n5() + var1.d5());
         this.k5.n5(this.k5.n5() + var1.e2());
         this.n5(var1);
         if (var3 != null) {
            this.n5(var1, var3);
         }

         if (var1.m1() == 2) {
            this.k5.k5();
         } else {
            this.u3 = var4;
            this.k5.k5();
            this.k5.n5(this.k5.n5() + var1.a6());
         }
      }
   }

   protected void n5(com.aspose.slides.internal.a0.k7 var1) {
      List var2 = var1.m3();
      this.k5.l6();
      this.k5.n5(this.k5.n5() + var1.e2());
      int var3 = var1.h0();
      if (var3 >= 0) {
         if ((var3 & 1) == 0) {
            this.u3 = this.u3 + var1.z8();
         } else {
            this.u3 = this.u3 + var1.j5();
            int var4 = l6(var1);
            if (var4 > 0) {
               this.u3 -= var4;
            }
         }
      } else {
         this.u3 = this.u3 + var1.z8();
      }

      int var10 = 0;

      for (int var5 = var2.size(); var10 < var5; var10++) {
         com.aspose.slides.internal.d2.c8 var6 = (com.aspose.slides.internal.d2.c8)var2.get_Item(var10);
         if (var6.t2 != 0) {
            this.s7 = var6.t2;

            try {
               this.l6(var6);
            } finally {
               this.s7 = 0;
            }
         } else {
            this.l6(var6);
         }
      }

      this.k5.k5();
   }

   private static int l6(com.aspose.slides.internal.a0.k7 var0) {
      List var1 = var0.m3();
      int var2 = 0;
      int var3 = 0;

      for (int var4 = var1.size(); var3 < var4; var3++) {
         com.aspose.slides.internal.d2.c8 var5 = (com.aspose.slides.internal.d2.c8)var1.get_Item(var3);
         var2 += var5.l6();
      }

      return var2 - var0.l6();
   }

   protected void l6(com.aspose.slides.internal.d2.c8 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.t9.class)) {
         this.n5((com.aspose.slides.internal.d2.t9)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.t4.class)) {
         this.n5((com.aspose.slides.internal.d2.t4)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.e2.class)) {
         this.n5((com.aspose.slides.internal.d2.e2)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.s7.class)) {
         this.n5((com.aspose.slides.internal.d2.s7)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.t2.class)) {
         this.n5((com.aspose.slides.internal.d2.t2)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.y4.class)) {
         this.n5((com.aspose.slides.internal.d2.y4)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.x8.class)) {
         this.n5((com.aspose.slides.internal.d2.x8)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.n3.class)) {
         this.n5((com.aspose.slides.internal.d2.n3)var1);
      }
   }

   protected abstract void n5(com.aspose.slides.internal.d2.c8 var1);

   protected void n5(com.aspose.slides.internal.d2.y4 var1) {
      this.n5((com.aspose.slides.internal.d2.c8)var1);
      this.u3 = this.u3 + var1.f_();
   }

   protected void n5(com.aspose.slides.internal.d2.n3 var1) {
      this.u3 = this.u3 + var1.f_();
   }

   protected void n5(com.aspose.slides.internal.d2.t9 var1) {
      List var2 = var1.d_();
      int var3 = this.u3;
      int var4 = 0;

      for (int var5 = var2.size(); var4 < var5; var4++) {
         com.aspose.slides.internal.d2.c8 var6 = (com.aspose.slides.internal.d2.c8)var2.get_Item(var4);
         this.l6(var6);
      }

      this.u3 = var3 + var1.f_();
   }

   protected void n5(com.aspose.slides.internal.d2.t4 var1) {
      this.u3 = this.u3 + var1.f_();
   }

   protected void n5(com.aspose.slides.internal.d2.e2 var1) {
      this.u3 = this.u3 + var1.f_();
   }

   protected void n5(com.aspose.slides.internal.d2.s7 var1) {
      int var2 = var1.h0();
      List var3 = var1.d_();
      this.n5((com.aspose.slides.internal.d2.c8)var1);
      int var4 = this.u3;
      this.k5.l6();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.a6.class) && (var2 & 1) != 0) {
         int var5 = 0;
         int var6 = 0;

         for (int var7 = var3.size(); var6 < var7; var6++) {
            com.aspose.slides.internal.d2.c8 var8 = (com.aspose.slides.internal.d2.c8)var3.get_Item(var6);
            var5 += var8.f_();
         }

         int var13 = var1.f_() - var5;
      } else {
         boolean var9 = false;
      }

      this.u3 = this.u3 + var1.n3() + var1.t2();
      this.k5.n5(this.k5.n5() + var1.w1());
      int var10 = 0;

      for (int var11 = var3.size(); var10 < var11; var10++) {
         com.aspose.slides.internal.d2.c8 var12 = (com.aspose.slides.internal.d2.c8)var3.get_Item(var10);
         this.l6(var12);
      }

      this.u3 = var4 + var1.f_();
      this.k5.k5();
   }

   protected void n5(com.aspose.slides.internal.d2.t2 var1) {
      this.n5((com.aspose.slides.internal.d2.c8)var1);
      this.u3 = this.u3 + var1.n3();
      this.k5.l6();
      this.k5.n5(this.k5.n5() + var1.w1());
      this.k5(var1.m1());
      this.k5.k5();
   }

   protected void n5(com.aspose.slides.internal.d2.x8 var1) {
      com.aspose.slides.internal.a0.l6 var2 = var1.m3();
      this.k5.l6();
      this.k5.n5(this.k5.n5() + var1.w1());
      com.aspose.slides.internal.o9b.y1 var3 = var1.k7().y4();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.d2.h0.class)) {
         this.n5((com.aspose.slides.internal.d2.h0)var2, var3.y4());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.d2.u3.class)) {
         this.n5((com.aspose.slides.internal.d2.u3)var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.d2.u9.class)) {
         this.n5((com.aspose.slides.internal.d2.u9)var2, var3.y4());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.d2.t2.class)) {
         this.n5((com.aspose.slides.internal.d2.t2)var2);
      }

      this.u3 = this.u3 + var1.f_();
      this.k5.k5();
   }

   public void n5(com.aspose.slides.internal.d2.h0 var1, com.aspose.slides.internal.o9b.y1 var2) {
   }

   public void n5(com.aspose.slides.internal.d2.u3 var1) {
      int var2 = this.u3;
      this.k5.l6();
      List var3 = var1.m1();
      this.n5((com.aspose.slides.internal.a0.t2)null, var3);
      this.u3 = var2;
      this.k5.k5();
   }

   public void n5(com.aspose.slides.internal.d2.u9 var1, com.aspose.slides.internal.o9b.y1 var2) {
   }

   public final void n5(k7 var1, XmlDocument var2, String var3) {
      throw new NotImplementedException();
   }

   protected final com.aspose.slides.internal.x4g.m1 k5(com.aspose.slides.internal.x4g.m1 var1) {
      float[] var2 = var1.n5();
      var2[4] /= 1000.0F;
      var2[5] /= 1000.0F;
      return new com.aspose.slides.internal.x4g.m1(var2[0], var2[1], var2[2], var2[3], var2[4], var2[5]);
   }
}
