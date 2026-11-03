package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class f0 {
   private com.aspose.slides.ms.System.r8 n5;
   private int l6;
   private int k5;
   private int u3;
   private com.aspose.slides.ms.System.j5 a6 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.b5 u9;
   private com.aspose.slides.internal.f3c.u9 h0;
   private com.aspose.slides.internal.f3c.u9 c8;
   private b3 t2;
   private boolean s7;
   private Dictionary<String, f5> x8;
   private boolean n3 = true;
   private boolean y4;
   private final Object e2 = new Object();
   private boolean t9;
   private u3 z1 = null;
   private boolean t4;
   private int q0;
   private int z3;
   private com.aspose.slides.internal.r5t.j5 m1;

   f0(com.aspose.slides.ms.System.r8 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = 0;
      com.aspose.slides.ms.System.j5.t2().u3(this.a6);
   }

   public com.aspose.slides.ms.System.r8 n5() {
      return this.n5;
   }

   public int l6() {
      return this.l6;
   }

   public com.aspose.slides.ms.System.b5 k5() {
      return this.u9;
   }

   public void n5(boolean var1) {
      this.k5(var1);
   }

   public boolean u3() {
      return this.t9;
   }

   public void l6(boolean var1) {
      this.t9 = var1;
   }

   boolean a6() {
      boolean var10000;
      if (this.n3) {
         if (this.u9 != null) {
         }

         var10000 = true;
      } else {
         var10000 = false;
      }

      return var10000;
   }

   void k5(boolean var1) {
      this.n3 = var1;
   }

   public void n5(boolean var1, int var2, int var3) {
      if (var1) {
         if (var2 <= 0) {
            throw new ArgumentOutOfRangeException("keepAliveTime", "Must be greater than 0");
         }

         if (var3 <= 0) {
            throw new ArgumentOutOfRangeException("keepAliveInterval", "Must be greater than 0");
         }
      }

      this.t4 = var1;
      this.q0 = var2;
      this.z3 = var3;
   }

   void n5(com.aspose.slides.internal.p6w.h0 var1) {
      if (this.t4) {
         byte[] var2 = new byte[12];
         n5(var2, com.aspose.slides.internal.v6g.k5.a6(this.t4 ? 1 : 0, 9), 0);
         n5(var2, com.aspose.slides.internal.v6g.k5.a6(this.q0, 9), 4);
         n5(var2, com.aspose.slides.internal.v6g.k5.a6(this.z3, 9), 8);
         var1.n5(com.aspose.slides.internal.p6w.k5.t4, var2, null);
      }
   }

   static void n5(byte[] var0, long var1, int var3) {
      var0[var3] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) & com.aspose.slides.internal.v6g.k5.a6(255, 9), 10)), 10
      );
      var0[var3 + 1] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(
            com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) & com.aspose.slides.internal.v6g.k5.a6(65280, 9), 10) >> 8, 10
         )),
         10
      );
      var0[var3 + 2] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(
            com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) & com.aspose.slides.internal.v6g.k5.a6(16711680, 9), 10) >> 16,
            10
         )),
         10
      );
      var0[var3 + 3] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(
            com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) & com.aspose.slides.internal.v6g.k5.a6(4278190080L, 10), 10)
               >> 24,
            10
         )),
         10
      );
   }

   boolean u9() {
      return this.s7;
   }

   void u3(boolean var1) {
      this.s7 = var1;
   }

   boolean h0() {
      return this.y4;
   }

   void a6(boolean var1) {
      this.y4 = var1;
   }

   private f5 n5(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      f5 var2 = null;
      f5[] var3 = new f5[]{var2};
      boolean var4 = this.x8 != null && this.x8.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      var2 = new f5(this, var1);
      var2.n5.l6(new a3(this));
      if (this.x8 == null) {
         this.x8 = new Dictionary<>();
      }

      this.x8.addItem(var1, var2);
      return var2;
   }

   private void n5(f5 var1) {
      if (this.x8 != null && this.x8.size() != 0) {
         this.x8.removeItemByKey(var1.n5());
      } else {
         throw new InvalidOperationException();
      }
   }

   boolean n5(com.aspose.slides.ms.System.j5[] var1) {
      com.aspose.slides.ms.System.j5.l6.u3(var1[0]);
      com.aspose.slides.ms.System.s4 var2 = new com.aspose.slides.ms.System.s4();
      List<f5> var3 = null;
      List var4 = null;
      synchronized (this) {
         if (this.x8 == null || this.x8.size() == 0) {
            com.aspose.slides.ms.System.j5.l6.u3(this.a6);
            return true;
         }

         com.aspose.slides.ms.System.s4.a6(com.aspose.slides.internal.v6g.k5.t2(this.k5, 9)).u3(var2);
         var3 = new List<>(this.x8.getValues());
      }

      for (f5 var6 : var3) {
         if (var6.n5(var2.n3(), var1)) {
            if (var4 == null) {
               var4 = new List();
            }

            var4.addItem(var6);
         }
      }

      synchronized (this) {
         var1[0].u3(this.a6);
         if (var4 != null) {
            for (Object recoveredElement$var7$5658 : var4) {
               f5 var7 = (f5)recoveredElement$var7$5658;
               this.n5(var7);
            }
         }

         if (this.x8 != null && this.x8.size() == 0) {
            this.x8 = null;
         }

         if (this.x8 == null) {
            if (this.m1 != null) {
               this.m1.dispose();
               this.m1 = null;
            }

            return true;
         } else {
            return false;
         }
      }
   }

   private void n5(Object var1) {
      com.aspose.slides.ms.System.j5 var2 = new com.aspose.slides.ms.System.j5();
      com.aspose.slides.ms.System.j5[] var3 = new com.aspose.slides.ms.System.j5[]{var2};
      this.n5(var3);
      var3[0].u3(var2);
   }

   b3 c8() {
      synchronized (this.e2) {
         if (this.t2 != null) {
            return this.t2;
         }

         String var2 = this.n5.a6();
         if (this.n5.u9() == 4 || this.n5.u9() == 3) {
            if (this.n5.u9() == 4) {
               var2 = com.aspose.slides.ms.System.d1.l6(var2, 1, var2.length() - 2);
            }

            this.t2 = new b3();
            this.t2.n5(new i1[]{i1.n5(var2)});
            return this.t2;
         }

         try {
            this.t2 = com.aspose.slides.internal.g8v.t4.u3(var2);
         } catch (RuntimeException var5) {
            return null;
         }
      }

      return this.t2;
   }

   void n5(com.aspose.slides.ms.System.b5 var1) {
      this.u9 = var1;
   }

   com.aspose.slides.ms.System.i1 n5(w1 var1, String var2) {
      v8 var7;
      synchronized (this) {
         boolean var4 = false;
         boolean[] var5 = new boolean[]{false};
         f5 var6 = this.n5(var2);
         var7 = var6.n5(var1, var5);
         var4 = var5[0];
         if (var4) {
            this.u3++;
            if (this.m1 == null) {
               this.m1 = new com.aspose.slides.internal.r5t.j5(new p3(this), null, this.k5, this.k5);
            }
         }
      }

      return var7.n5(var1);
   }

   void n5(com.aspose.slides.internal.f3c.u9 var1, com.aspose.slides.internal.f3c.u9 var2) {
      this.h0 = var2;
      this.c8 = var1;
   }

   boolean n5(com.aspose.slides.internal.p6w.h0 var1, e5 var2) {
      if (this.z1 == null) {
         return true;
      }

      int var3 = 0;

      while (true) {
         q0 var4 = null;

         try {
            var4 = this.z1.n5(this, var2, var3);
         } catch (RuntimeException var6) {
            return false;
         }

         if (var4 == null) {
            return true;
         }

         try {
            var1.n5(var4);
            return true;
         } catch (com.aspose.slides.internal.p6w.q0 var7) {
            var3++;
         }
      }
   }

   // $VF: synthetic method
   static int n5(f0 var0) {
      return var0.u3--;
   }

   // $VF: synthetic method
   static void n5(f0 var0, Object var1) {
      var0.n5(var1);
   }
}
