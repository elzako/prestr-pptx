package com.aspose.slides.internal.m2;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e1.a6;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.p8;
import com.aspose.slides.internal.e1.q0;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.y4;
import com.aspose.slides.internal.j7.s7;
import com.aspose.slides.internal.j7.t2;
import com.aspose.slides.internal.j7.u9;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.u3;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.s5.c8;
import com.aspose.slides.internal.w0.n3;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.z0k.e2;

public class k5 extends y4 {
   private z1 n5;
   private com.aspose.slides.internal.o9b.l6 l6;
   private com.aspose.slides.internal.o9b.l6 k5;
   private z1 u3;
   private static int a6;
   private final l6 u9 = new l6();
   private final Stack<m1> h0 = new Stack<>();
   private final Stack<a0> c8 = new Stack<>();
   private final Stack<Integer> t2 = new Stack<>();
   private static final e5 s7 = new e5(e5.t2());
   private s7 x8;

   public final void n5(m3 var1, z1 var2) {
      byte var3 = 3;
      this.n5(var1, var2, var3);
   }

   public final void n5(m3 var1, z1 var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("node");
      }

      if (var2 == null) {
         throw new ArgumentNullException("graphics");
      }

      int var4 = var2.e2();
      var2.u3(var3);
      float var5 = var2.y4();
      var2.n5(1.0F);
      this.n5 = var2;
      this.x8 = new s7();
      s7 var6 = this.x8;

      try {
         this.l6(var1);
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      var2.n5(var5);
      var2.u3(var4);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.z1 var1) {
      this.n5((p8)var1);
      w1 var2 = new w1(var1.t9(), var1.e2());
      if (var1.u9() != null && (var1.u9().n5() != 0 || com.aspose.slides.internal.p1s.n5.u3(((n3)var1.u9()).l6(), com.aspose.slides.internal.p1s.n5.b2))) {
         u3 var3 = com.aspose.slides.internal.j7.k5.n5(var1.u9());

         try {
            com.aspose.slides.internal.o9b.n3 var4 = com.aspose.slides.internal.j7.u9.n5(var1.l6(), this.x8);

            try {
               com.aspose.slides.internal.n2d.y4.n5(var1.x8(), var4, var3, var2.u3(), s7, this.n5);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }

      if (var1.c8() != null
         && var1.c8().u9() != null
         && (var1.c8().u9().n5() != 0 || com.aspose.slides.internal.p1s.n5.u3(((n3)var1.c8().u9()).l6(), com.aspose.slides.internal.p1s.n5.b2))) {
         com.aspose.slides.internal.x4g.s7 var29 = new com.aspose.slides.internal.x4g.s7();
         com.aspose.slides.internal.o9b.n3 var30 = com.aspose.slides.internal.j7.u9.n5(var1.l6(), this.x8);

         try {
            var29.n5(var1.x8(), var30.l6(), var30.x8(), var1.l6().c8(), var2.u3(), s7);
         } finally {
            if (var30 != null) {
               var30.dispose();
            }
         }

         com.aspose.slides.internal.o9b.m3 var5 = com.aspose.slides.internal.j7.t2.n5(var1.c8());

         try {
            this.n5.n5(var5, var29);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      }

      this.l6((com.aspose.slides.internal.e1.p8)(var1));
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.t2 var1) {
      if (var1.h0() != null) {
         this.n5.n5(var1.h0().n5().o8());
      }

      this.n5((p8)var1);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.t2 var1) {
      this.l6((p8)var1);
   }

   @Override
   public void l6(r4 var1) {
      this.n5((p8)var1);
      this.u9.l6(var1);
   }

   @Override
   public void n5(r4 var1) {
      this.u9.n5(var1);
      if (var1.k5() != null) {
         u3 var2 = com.aspose.slides.internal.j7.k5.n5(var1.k5());

         try {
            if (var1.u9() == 7 && this.l6 != null && this.l6.s7() == 2498570) {
               a6++;
               if (this.k5 == null) {
                  this.k5 = new com.aspose.slides.internal.o9b.l6(this.l6.e2(), this.l6.h0(), 2498570);
                  this.u3 = z1.n5(this.k5);
                  this.u3.u3(this.n5.e2());
                  this.u3.l6(this.n5.m1().u9());
               }

               this.u3.n5(var2, this.u9.l6());
               if (a6 > 90) {
                  this.n5(this.k5);
                  this.k5 = null;
                  a6 = 0;
               }
            } else {
               if (this.k5 != null) {
                  this.n5(this.k5);
                  this.k5 = null;
                  a6 = 0;
               }

               this.n5.n5(var2, this.u9.l6());
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }

      if (var1.l6() != null) {
         com.aspose.slides.internal.o9b.m3 var19 = com.aspose.slides.internal.j7.t2.n5(var1.l6());

         try {
            if (var1.u9() == 7 && this.l6 != null && this.l6.s7() == 2498570) {
               com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(this.l6.e2(), this.l6.h0(), this.l6.s7());

               try {
                  z1 var4 = z1.n5(var3);
                  var4.u3(this.n5.e2());
                  var4.l6(this.n5.m1().u9());
                  var4.n5(var19, this.u9.l6());
                  this.n5(var3);
               } finally {
                  if (var3 != null) {
                     var3.dispose();
                  }
               }
            } else {
               if (this.k5 != null) {
                  this.n5(this.k5);
                  this.k5 = null;
                  a6 = 0;
               }

               this.n5.n5(var19, this.u9.l6());
            }
         } finally {
            if (var19 != null) {
               var19.dispose();
            }
         }
      }

      this.l6((p8)var1);
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1) {
      com.aspose.slides.internal.j9e.n5 var2 = var1.n5(new y2(0, 0, var1.e2(), var1.h0()), 1, 2498570);
      int var3 = var2.a6() * var1.h0();
      byte[] var4 = new byte[var3];
      com.aspose.slides.internal.e3m.n5.n5(var2.u3(), var4, 0, var3);
      var1.n5(var2);
      com.aspose.slides.internal.j9e.n5 var5 = this.l6.n5(new y2(0, 0, this.l6.e2(), this.l6.h0()), 3, 2498570);
      int var6 = var5.a6() * this.l6.h0();
      byte[] var7 = new byte[var6];
      com.aspose.slides.internal.e3m.n5.n5(var5.u3(), var7, 0, var6);

      for (int var8 = 0; var8 < var7.length; var8 += 4) {
         if ((var4[var8 + 3] & 255) != 0) {
            var7[var8] = (byte)(var7[var8] & 0xFF ^ var4[var8] & 0xFF);
            var7[var8 + 1] = (byte)(var7[var8 + 1] & 0xFF ^ var4[var8 + 1] & 0xFF);
            var7[var8 + 2] = (byte)(var7[var8 + 2] & 0xFF ^ var4[var8 + 2] & 0xFF);
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var7, 0, var5.u3(), var6);
      this.l6.n5(var5);
   }

   @Override
   public void n5(c4 var1) {
      this.u9.n5(var1);
   }

   @Override
   public void l6(c4 var1) {
      this.u9.l6(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.y2 var1) {
      this.u9.n5(var1);
   }

   @Override
   public void n5(a6 var1) {
      this.u9.n5(var1);
   }

   @Override
   public void n5(k7 var1) {
      try {
         this.l6(var1);
      } catch (RuntimeException var3) {
         this.l6(k7.n5(var1));
      }
   }

   private void l6(k7 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(new e2(var1.u3()));

      try {
         if (var1.s7() == 1) {
            var2.n5();
         }

         c8 var3 = var1.h0();
         com.aspose.slides.internal.j9e.t2 var4 = null;
         if (var1.t2() != null) {
            var4 = new com.aspose.slides.internal.j9e.t2();
            var4.n5(var1.t2().n5().n5().o8(), var1.t2().l6().n5().o8());
         }

         int var5 = 2;
         int[] var6 = new int[]{2};
         y1 var7 = var2.n5(var6).y4();
         var5 = var6[0];
         y1 var8 = var1.k5().y4();
         w1[] var9 = new w1[]{var8.u9(), new w1(var8.x8() + var8.s7(), var8.n3()), new w1(var8.x8(), var8.n3() + var8.k5())};
         if (!com.aspose.slides.internal.s5.c8.n5(var3)) {
            var3.n5(var7.y4()).a6(var7);
         }

         com.aspose.slides.internal.n2d.y4.n5(var2, var9, var7.y4(), var5, var4, this.n5);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void n5(p8 var1) {
      if (q0.l6(var1)) {
         this.h0.push(this.n5.m1().u9());
         m1 var2 = com.aspose.slides.internal.j7.c8.n5(var1.u3());

         try {
            com.aspose.slides.internal.n2d.y4.n5(this.n5, var2, 0);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }

      if (q0.k5(var1)) {
         this.c8.push(this.n5.u9().l6());
         n5 var6 = new n5();
         var6.l6(var1.a6());
         com.aspose.slides.internal.n2d.y4.n5(this.n5, var6.n5(), var6.l6(), 1);
      }

      this.t2.push(this.n5.c8());
   }

   private void l6(p8 var1) {
      if (q0.k5(var1)) {
         this.n5.l6(this.c8.pop());
      }

      if (q0.l6(var1)) {
         this.n5.l6(this.h0.pop());
      }

      this.n5.n5(this.t2.pop());
   }

   static {
      s7.k5(s7.k5() | 2048);
   }
}
