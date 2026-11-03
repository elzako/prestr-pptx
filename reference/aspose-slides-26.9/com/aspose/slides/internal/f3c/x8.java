package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.i2i.y4$n5;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class x8 {
   private int l6;
   private y4 k5;
   private t9 u3;
   private z1[] a6;
   static z1[] n5 = (z1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), 0));
   private int u9;
   private u3 h0;
   private com.aspose.slides.internal.o8m.a6 c8;
   private n3 t2;
   private c8 s7;
   private c8 x8;
   private j5 n3;
   private j5 y4;
   private j5 e2;
   private j5 t9;
   private c8 z1;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "2.5.29.15", "2.5.29.19", "2.5.29.20", "2.5.29.35", "2.5.29.21"
   );

   public x8() {
      this(false);
   }

   public x8(boolean var1) {
      this.l6 = var1 ? 2 : 1;
      this.k5 = new y4();
      this.u3 = new t9();
   }

   public t9 n5() {
      return this.u3;
   }

   public boolean n5(h0 var1) {
      if (var1 == null) {
         throw new ArgumentException("certificate");
      }

      this.l6();

      int var2;
      try {
         var2 = this.k5(var1);
         this.n5(var2);
      } catch (CryptographicException var11) {
         throw new ArgumentException("certificate", var11);
      }

      int var3 = 0;
      ArrayList var4 = new ArrayList();

      for (Object recoveredElement$var6$1693 : this.k5) {
         n3 var6 = (n3)recoveredElement$var6$1693;
         for (z1 var10 : var6.l6()) {
            if ((var3 & var10.n5()) != var10.n5()) {
               var4.addItem(com.aspose.slides.internal.v6g.k5.n5(var10));
               var3 |= var10.n5();
            }
         }
      }

      if (var2 != 0) {
         var4.insertItem(0, com.aspose.slides.internal.v6g.k5.n5(new z1(var2)));
      }

      this.a6 = com.aspose.slides.internal.v6g.k5.k5(var4.toArray(com.aspose.slides.internal.v6g.k5.n5(z1.class)), z1[].class);
      if (this.a6.length != 0 && this.n5().u3() != 4095) {
         boolean var12 = true;

         for (z1 var16 : this.a6) {
            switch (var16.n5()) {
               case 1:
                  var12 &= (this.n5().u3() & 1) != 0;
                  break;
               case 2:
                  var12 &= (this.n5().u3() & 4) != 0;
                  break;
               case 32:
               case 65536:
                  var12 &= (this.n5().u3() & 16) != 0;
                  break;
               case 256:
                  var12 &= (this.n5().u3() & 32) != 0;
                  break;
               case 512:
               case 33554432:
                  var12 &= (this.n5().u3() & 128) != 0;
                  break;
               case 1024:
                  var12 &= (this.n5().u3() & 8) != 0;
                  break;
               case 2048:
               case 4096:
               case 16384:
               case 32768:
                  var12 &= (this.n5().u3() & 64) != 0;
                  break;
               case 131072:
                  var12 &= (this.n5().u3() & 2) != 0;
               case 262144:
                  break;
               case 524288:
                  var12 &= (this.n5().u3() & 32) != 0;
                  break;
               default:
                  var12 = false;
            }

            if (!var12) {
               return false;
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public void l6() {
      if (this.a6 != null && this.a6.length != 0) {
         this.a6 = null;
      }

      if (this.k5.size() > 0) {
         this.k5.l6();
      }

      if (this.e2 != null) {
         this.e2.k5();
         this.e2 = null;
      }

      if (this.n3 != null) {
         this.n3.k5();
         this.n3 = null;
      }

      if (this.t9 != null) {
         this.t9.k5();
         this.t9 = null;
      }

      if (this.y4 != null) {
         this.y4.k5();
         this.y4 = null;
      }

      this.s7 = null;
      this.x8 = null;
      this.z1 = null;
      this.t2 = null;
      this.c8 = null;
   }

   private c8 k5() {
      if (this.s7 == null) {
         c8 var1 = new c8();
         j5 var2 = this.a6();
         if (this.l6 == 1) {
            var1.n5(this.u9().n5());
         }

         var1.n5(var2.n5());
         this.s7 = var1;
      }

      return this.s7;
   }

   private c8 u3() {
      if (this.x8 == null) {
         c8 var1 = new c8();
         j5 var2 = this.h0();
         if (this.l6 == 1) {
            var1.n5(this.c8().n5());
         }

         var1.n5(var2.n5());
         this.x8 = var1;
      }

      return this.x8;
   }

   private j5 a6() {
      if (this.n3 == null) {
         this.n3 = new j5((short)6, 2);

         try {
            this.n3.n5(4);
         } catch (RuntimeException var2) {
         }
      }

      return this.n3;
   }

   private j5 u9() {
      if (this.e2 == null) {
         this.e2 = new j5((short)6, 1);

         try {
            this.e2.n5(4);
         } catch (RuntimeException var2) {
         }
      }

      return this.e2;
   }

   private j5 h0() {
      if (this.y4 == null) {
         this.y4 = new j5((short)3, 2);

         try {
            this.y4.n5(4);
         } catch (RuntimeException var2) {
         }
      }

      return this.y4;
   }

   private j5 c8() {
      if (this.t9 == null) {
         this.t9 = new j5((short)3, 1);

         try {
            this.t9.n5(4);
         } catch (RuntimeException var2) {
         }
      }

      return this.t9;
   }

   private c8 t2() {
      if (this.z1 == null) {
         this.z1 = new c8(this.n5().n5());
         this.z1.n5(this.k5());
         this.z1.n5(this.u3());
      }

      return this.z1;
   }

   private int k5(h0 var1) {
      this.k5.n5(var1);

      while (!this.a6(var1)) {
         var1 = this.u3(var1);
         if (var1 == null) {
            return 65536;
         }

         if (this.k5.l6(var1)) {
            return 128;
         }

         this.k5.n5(var1);
      }

      if (!this.k5().l6(var1)) {
         this.k5.n5(this.k5.size() - 1).n5(this.k5.n5(this.k5.size() - 1).k5() | 32);
      }

      return 0;
   }

   private h0 n5(h0 var1, c8 var2) {
      switch (var2.size()) {
         case 0:
            return null;
         case 1:
            return var2.n5(0);
         default:
            c8 var3 = var2.n5(6, com.aspose.slides.internal.v6g.k5.n5(this.n5().a6()), false);
            switch (var3.size()) {
               case 0:
                  var3 = var2;
               default:
                  String var4 = l6(var1);
                  if (d1.n5(var4)) {
                     return var3.n5(0);
                  } else {
                     for (Object recoveredElement$var6$6956 : var3) {
                        h0 var6 = (h0)recoveredElement$var6$6956;
                        String var7 = this.h0(var6);
                        if (d1.a6(var4, var7)) {
                           return var6;
                        }
                     }

                     return var3.n5(0);
                  }
               case 1:
                  return var3.n5(0);
            }
      }
   }

   private h0 u3(h0 var1) {
      c8 var2 = this.t2().n5(2, var1.n5(), false);
      String var3 = l6(var1);
      if (var3 != null && var3.length() > 0) {
         var2.n5(this.t2().n5(14, var3, false));
      }

      h0 var4 = this.n5(var1, var2);
      return var1.n5(var4) ? null : var4;
   }

   private boolean a6(h0 var1) {
      if (!this.u9(var1)) {
         return false;
      }

      if (var1.j5() < 3) {
         return true;
      }

      String var2 = this.h0(var1);
      if (d1.n5(var2)) {
         return true;
      }

      String var3 = l6(var1);
      return d1.n5(var3) ? true : d1.a6(var3, var2);
   }

   private boolean u9(h0 var1) {
      return d1.a6(var1.n5(), var1.l6());
   }

   private void n5(int var1) {
      int var2 = this.k5.size() - 1;
      h0 var3 = this.k5.n5(var2).n5();
      if ((var1 & 65536) == 0) {
         this.l6(var2);
         if (var2 == 0) {
            this.k5.n5(0).u3();
            return;
         }

         var2--;
      }

      this.c8 = var3.q0().k5();
      this.h0 = var3.e2();
      this.u9 = var2;

      for (int var4 = var2; var4 > 0; var4--) {
         this.l6(var4);
         this.k5(var4);
      }

      this.l6(0);
      this.u3(var1);
      this.s7();
   }

   private void l6(int var1) {
      n3 var2 = this.k5.n5(var1);
      h0 var3 = var2.n5();
      if (var1 != this.k5.size() - 1 && "1.2.840.10040.4.1".equals(var3.r4().a6()) && var3.r4().u9() == null) {
         h0 var4 = this.k5.n5(var1 + 1).n5();
         var3.r4().n5(var4.r4().u9());
      }

      boolean var5 = this.c8 == null;
      if (!this.n5(var3, var5 ? var3.q0().k5() : this.c8) && (var5 || var1 != this.k5.size() - 1 || this.u9(var3))) {
         var2.n5(var2.k5() | 8);
      }

      if (com.aspose.slides.ms.System.j5.k5(this.n5().a6(), var3.z1()) || com.aspose.slides.ms.System.j5.n5(this.n5().a6(), var3.t9())) {
         var2.n5(var2.k5() | 1);
      }

      if (!var5) {
         if (!com.aspose.slides.internal.f3c.u3.n5(var3.e2(), this.h0)) {
            var2.n5(var2.k5() | 2048);
         }

         if (!this.u9(var3) && var1 != 0) {
         }
      }
   }

   private void k5(int var1) {
      n3 var2 = this.k5.n5(var1);
      h0 var3 = var2.n5();
      this.h0 = var3.m3();
      this.c8 = var3.q0().k5();
      a6 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.y4().n5("2.5.29.19"), a6.class);
      if (var4 != null) {
         if (!var4.k5()) {
            var2.n5(var2.k5() | 1024);
         }
      } else if (var3.j5() >= 3) {
         var2.n5(var2.k5() | 1024);
      }

      if (!this.u9(var3)) {
         if (this.u9 > 0) {
            this.u9--;
         } else if (this.t2 != null) {
            this.t2.n5(this.t2.k5() | 1024);
         }
      }

      if (var4 != null && var4.u3() && var4.a6() < this.u9) {
         this.u9 = var4.a6();
         this.t2 = var2;
      }

      z8 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.y4().n5("2.5.29.15"), z8.class);
      if (var5 != null) {
         byte var6 = 4;
         if ((var5.k5() & var6) != var6) {
            var2.n5(var2.k5() | 16);
         }
      }

      this.n5(var2);
   }

   private void s7() {
      n3 var1 = this.k5.n5(0);
      h0 var2 = var1.n5();
      if (this.u9(var2)) {
      }

      this.n5(var1);

      for (int var3 = this.k5.size() - 1; var3 >= 0; var3--) {
         this.k5.n5(var3).u3();
      }
   }

   private void n5(n3 var1) {
      for (Object recoveredElement$var3$10734 : var1.n5().y4()) {
         m1 var3 = (m1)recoveredElement$var3$10734;
         if (var3.u9()) {
            switch (t4.n5(var3.n5().l6())) {
               case 0:
               case 1:
                  break;
               default:
                  var1.n5(var1.k5() | 256);
            }
         }
      }
   }

   private boolean n5(h0 var1, com.aspose.slides.internal.o8m.a6 var2) {
      if (var2 == null) {
         return false;
      }

      com.aspose.slides.internal.i2i.l6 var3 = var1.r4();
      return var3.n5(var2);
   }

   private String h0(h0 var1) {
      w1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.y4().n5("2.5.29.14"), w1.class);
      return var2 == null ? d1.n5 : var2.k5();
   }

   static String l6(h0 var0) {
      return n5(var0.r4().l6().l6("2.5.29.35"));
   }

   static String n5(com.aspose.slides.internal.i2i.y4 var0) {
      return n5(var0.n5().l6("2.5.29.35"));
   }

   static String n5(com.aspose.slides.internal.i2i.a6 var0) {
      if (var0 == null) {
         return d1.n5;
      }

      com.aspose.slides.internal.i2i.c8 var1 = new com.aspose.slides.internal.i2i.c8(var0);
      byte[] var2 = var1.u9();
      if (var2 == null) {
         return d1.n5;
      }

      a5 var3 = new a5();

      for (byte var7 : var2) {
         var3.n5(com.aspose.slides.ms.System.e2.n5(var7, "X02"));
      }

      return var3.toString();
   }

   private void u3(int var1) {
      boolean var2 = (var1 & 65536) != 0;
      boolean var3;
      switch (this.n5().k5()) {
         case 0:
            return;
         case 1:
            var3 = true;
            break;
         case 2:
            var3 = false;
            break;
         default:
            throw new InvalidOperationException(d1.n5("Invalid revocation mode.", new Object[]{}));
      }

      boolean var4 = var2;

      for (int var5 = this.k5.size() - 1; var5 >= 0; var5--) {
         boolean var6 = true;
         switch (this.n5().l6()) {
            case 0:
               var6 = var5 == 0;
               break;
            case 1:
               var6 = true;
               break;
            case 2:
               var6 = var5 != this.k5.size() - 1;
         }

         n3 var7 = this.k5.n5(var5);
         if (!var4) {
            var4 |= (var7.k5() & 8) != 0;
         }

         if (var4) {
            var7.n5(var7.k5() | 64);
            var7.n5(var7.k5() | 16777216);
         } else if (var6 && !var2 && !this.u9(var7.n5())) {
            var7.n5(var7.k5() | this.n5(var7.n5(), var5 + 1, var3));
            var4 |= (var7.k5() & 4) != 0;
         }
      }
   }

   private int n5(h0 var1, int var2, boolean var3) {
      int var4 = 64;
      n3 var5 = this.k5.n5(var2);
      h0 var6 = var5.n5();

      while (this.u9(var6) && var2 < this.k5.size() - 1) {
         var4 = this.n5(var1, var6, var3);
         if (var4 != 64) {
            break;
         }

         var5 = this.k5.n5(++var2);
         var6 = var5.n5();
      }

      if (var4 == 64) {
         var4 = this.n5(var1, var6, var3);
      }

      return var4;
   }

   private int n5(h0 var1, h0 var2, boolean var3) {
      z8 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.y4().n5("2.5.29.15"), z8.class);
      if (var4 != null) {
         byte var5 = 2;
         if ((var4.k5() & var5) != var5) {
            return 64;
         }
      }

      com.aspose.slides.internal.i2i.y4 var7 = this.c8(var2);
      if (var7 == null && var3) {
      }

      if (var7 != null) {
         if (!var7.n5(var2.q0().k5())) {
            return 64;
         }

         y4$n5 var6 = var7.n5(var1.r4());
         if (var6 != null) {
            if (!this.n5(var6)) {
               return 4;
            }

            if (com.aspose.slides.ms.System.j5.u3(var6.l6(), this.n5().a6())) {
               return 4;
            }
         }

         if (com.aspose.slides.ms.System.j5.k5(var7.u3(), this.n5().a6())) {
            return 16777280;
         } else {
            return !this.l6(var7) ? 64 : 0;
         }
      } else {
         return 64;
      }
   }

   static com.aspose.slides.internal.i2i.y4 n5(String var0, String var1, ArrayList var2) {
      for (Object recoveredElement$var4$14828 : var2) {
         com.aspose.slides.internal.i2i.y4 var4 = (com.aspose.slides.internal.i2i.y4)recoveredElement$var4$14828;
         if (d1.a6(var4.k5(), var0) && (var1.length() == 0 || d1.a6(var1, n5(var4)))) {
            return var4;
         }
      }

      return null;
   }

   private com.aspose.slides.internal.i2i.y4 c8(h0 var1) {
      String var2 = var1.m3().n5(0);
      String var3 = this.h0(var1);
      com.aspose.slides.internal.i2i.y4 var4 = this.h0().l6() == null ? null : n5(var2, var3, this.h0().l6().l6());
      if (var4 != null) {
         return var4;
      }

      if (this.l6 == 1) {
         var4 = n5(var2, var3, this.c8().l6().l6());
         if (var4 != null) {
            return var4;
         }
      }

      var4 = this.a6().l6() == null ? null : n5(var2, var3, this.a6().l6().l6());
      if (var4 != null) {
         return var4;
      }

      if (this.l6 == 1) {
         var4 = n5(var2, var3, this.u9().l6().l6());
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   private boolean l6(com.aspose.slides.internal.i2i.y4 var1) {
      for (Object recoveredElement$var3$15884 : var1.n5()) {
         com.aspose.slides.internal.i2i.a6 var3 = (com.aspose.slides.internal.i2i.a6)recoveredElement$var3$15884;
         if (var3.u3()) {
            switch (t4.n5(var3.k5())) {
               case 2:
               case 3:
                  break;
               default:
                  return false;
            }
         }
      }

      return true;
   }

   private boolean n5(y4$n5 var1) {
      for (Object recoveredElement$var3$16237 : var1.k5()) {
         com.aspose.slides.internal.i2i.a6 var3 = (com.aspose.slides.internal.i2i.a6)recoveredElement$var3$16237;
         if (var3.u3()) {
            switch (t4.n5(var3.k5())) {
               case 4:
                  break;
               default:
                  return false;
            }
         }
      }

      return true;
   }

   @Override
   public String toString() {
      String var1 = j8.n5(this).s7().substring(j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography.X509Certificates." + var1;
   }
}
