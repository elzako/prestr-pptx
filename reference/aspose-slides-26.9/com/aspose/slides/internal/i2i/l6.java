package com.aspose.slides.internal.i2i;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.o8m.a7;
import com.aspose.slides.internal.o8m.e9;
import com.aspose.slides.internal.o8m.f2;
import com.aspose.slides.internal.o8m.h6;
import com.aspose.slides.internal.o8m.i6;
import com.aspose.slides.internal.o8m.j4;
import com.aspose.slides.internal.o8m.l4;
import com.aspose.slides.internal.o8m.m1;
import com.aspose.slides.internal.o8m.m3;
import com.aspose.slides.internal.o8m.r1;
import com.aspose.slides.internal.o8m.r8;
import com.aspose.slides.internal.o8m.s4;
import com.aspose.slides.internal.o8m.v3;
import com.aspose.slides.internal.o8m.v4;
import com.aspose.slides.internal.o8m.y5;
import com.aspose.slides.internal.o8m.z3;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.internal.o8m.z7;
import com.aspose.slides.internal.o8m.z8;
import com.aspose.slides.internal.x8w.k7;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.w5;

public class l6 {
   private com.aspose.slides.internal.x8w.l6 n5;
   private byte[] l6;
   private j5 k5 = new j5();
   private j5 u3 = new j5();
   private com.aspose.slides.internal.x8w.l6 a6;
   private String u9;
   private String h0;
   private byte[] c8;
   private com.aspose.slides.internal.x8w.l6 t2;
   private String s7;
   private byte[] x8;
   private byte[] n3;
   private String y4;
   private byte[] e2;
   private byte[] t9;
   private z6 z1;
   private z3 t4;
   private int q0;
   private byte[] z3;
   private byte[] m1;
   private byte[] k7;
   private u9 m3;
   private static String z8 = d1.n5("Input data cannot be coded as a valid certificate.", new Object[]{});
   private static final com.aspose.slides.internal.v6g.u9 j5 = new com.aspose.slides.internal.v6g.u9(
      "1.2.840.113549.1.1.2",
      "1.2.840.113549.1.1.3",
      "1.2.840.113549.1.1.4",
      "1.2.840.113549.1.1.5",
      "1.3.14.3.2.29",
      "1.2.840.10040.4.3",
      "1.2.840.113549.1.1.11",
      "1.2.840.113549.1.1.12",
      "1.2.840.113549.1.1.13"
   );

   private void l6(byte[] var1) {
      try {
         this.n5 = new com.aspose.slides.internal.x8w.l6(var1);
         if (this.n5.l6() != 48) {
            throw new CryptographicException(z8);
         }

         com.aspose.slides.internal.x8w.l6 var2 = null;
         if (this.n5.n5(0).l6() != 48) {
            var2 = this.n5;
         } else {
            var2 = this.n5.n5(0);
         }

         int var3 = 0;
         com.aspose.slides.internal.x8w.l6 var4 = var2.n5(var3);
         this.q0 = 1;
         if ((var4.l6() & 255) == 160 && var4.n5() > 0) {
            this.q0 = this.q0 + var4.n5(0).u3()[0];
            var3++;
         }

         com.aspose.slides.internal.x8w.l6 var5 = var2.n5(var3++);
         if (var5.l6() != 2) {
            throw new CryptographicException(z8);
         }

         this.z3 = var5.u3();
         w5.n5(this.z3, 0, this.z3.length);
         int var10002 = ++var3;
         var3++;
         this.a6 = var2.n5(var10002, (byte)48);
         this.u9 = com.aspose.slides.internal.i2i.n3.n5(this.a6);
         com.aspose.slides.internal.x8w.l6 var6 = var2.n5(var3++, (byte)48);
         com.aspose.slides.internal.x8w.l6 var7 = var6.n5(0);
         this.k5 = com.aspose.slides.internal.x8w.k5.k5(var7);
         com.aspose.slides.internal.x8w.l6 var8 = var6.n5(1);
         this.u3 = com.aspose.slides.internal.x8w.k5.k5(var8);
         this.t2 = var2.n5(var3++, (byte)48);
         this.s7 = com.aspose.slides.internal.i2i.n3.n5(this.t2);
         com.aspose.slides.internal.x8w.l6 var9 = var2.n5(var3++, (byte)48);
         com.aspose.slides.internal.x8w.l6 var10 = var9.n5(0, (byte)48);
         com.aspose.slides.internal.x8w.l6 var11 = var10.n5(0, (byte)6);
         this.h0 = com.aspose.slides.internal.x8w.k5.l6(var11);
         com.aspose.slides.internal.x8w.l6 var12 = var10.n5(1);
         this.c8 = var10.n5() > 1 ? var12.a6() : null;
         com.aspose.slides.internal.x8w.l6 var13 = var9.n5(1, (byte)3);
         int var14 = var13.k5() - 1;
         this.x8 = new byte[var14];
         com.aspose.slides.ms.System.y4.n5(var13.u3(), 1, this.x8, 0, var14);
         byte[] var15 = this.n5.n5(2).u3();
         this.n3 = new byte[var15.length - 1];
         com.aspose.slides.ms.System.y4.n5(var15, 1, this.n3, 0, this.n3.length);
         if (this.n5.n5(0).l6() == 48) {
            var10 = this.n5.n5(1);
            var11 = var10.n5(0, (byte)6);
            this.y4 = com.aspose.slides.internal.x8w.k5.l6(var11);
            var12 = var10.n5(1);
            if (var12 != null) {
               this.e2 = var12.a6();
            } else {
               this.e2 = null;
            }
         }

         com.aspose.slides.internal.x8w.l6 var16 = var2.n5(var3, (byte)-127);
         if (var16 != null) {
            var3++;
            this.m1 = var16.u3();
         }

         com.aspose.slides.internal.x8w.l6 var17 = var2.n5(var3, (byte)-126);
         if (var17 != null) {
            var3++;
            this.k7 = var17.u3();
         }

         com.aspose.slides.internal.x8w.l6 var18 = var2.n5(var3, (byte)-93);
         if (var18 != null && var18.n5() == 1) {
            this.m3 = new u9(var18.n5(0));
         } else {
            this.m3 = new u9(null);
         }

         this.l6 = (byte[])var1.clone();
      } catch (Exception var19) {
         throw new CryptographicException(z8, var19);
      }
   }

   public l6(byte[] var1) {
      if (var1 != null) {
         if (var1.length > 0 && var1[0] != 48) {
            try {
               var1 = n5("CERTIFICATE", var1);
            } catch (Exception var3) {
               throw new CryptographicException(z8, var3);
            }
         }

         this.l6(var1);
      }
   }

   private byte[] k5(byte[] var1) {
      if (var1[0] == 0) {
         int var2 = var1.length - 1;
         byte[] var3 = new byte[var2];
         com.aspose.slides.ms.System.y4.n5(var1, 1, var3, 0, var2);
         return var3;
      } else {
         return var1;
      }
   }

   public z3 n5() {
      if (this.c8 == null) {
         throw new CryptographicException("Missing key algorithm parameters.");
      }

      if (this.t4 == null) {
         m3 var1 = new m3();
         com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(this.x8);
         if (var2 == null || var2.l6() != 2) {
            return null;
         }

         var1.c8 = this.k5(var2.u3());
         com.aspose.slides.internal.x8w.l6 var3 = new com.aspose.slides.internal.x8w.l6(this.c8);
         if (var3 == null || var3.l6() != 48 || var3.n5() < 3) {
            return null;
         }

         if (var3.n5(0).l6() != 2 || var3.n5(1).l6() != 2 || var3.n5(2).l6() != 2) {
            return null;
         }

         var1.u3 = this.k5(var3.n5(0).u3());
         var1.a6 = this.k5(var3.n5(1).u3());
         var1.l6 = this.k5(var3.n5(2).u3());
         this.t4 = new m1(var1.c8.length << 3);
         this.t4.l6(var1.n5());
      }

      return this.t4;
   }

   public void n5(z3 var1) {
      this.t4 = var1;
      if (var1 != null) {
         this.z1 = null;
      }
   }

   public u9 l6() {
      return this.m3;
   }

   public byte[] k5() {
      if (this.t9 == null) {
         f2 var1 = null;
         switch (j5.n5(this.y4)) {
            case 0:
               var1 = com.aspose.slides.internal.x8w.k7.a6();
               break;
            case 1:
               var1 = com.aspose.slides.internal.x8w.u3.a6();
               break;
            case 2:
               var1 = z7.a6();
               break;
            case 3:
            case 4:
            case 5:
               var1 = s4.a6();
               break;
            case 6:
               var1 = l4.a6();
               break;
            case 7:
               var1 = a7.a6();
               break;
            case 8:
               var1 = r1.a6();
               break;
            default:
               return null;
         }

         if (this.n5 == null || this.n5.n5() < 1) {
            return null;
         }

         byte[] var2 = this.n5.n5(0).a6();
         this.t9 = var1.k5(var2, 0, var2.length);
      }

      return (byte[])this.t9.clone();
   }

   public String u3() {
      return this.u9;
   }

   public String a6() {
      return this.h0;
   }

   public byte[] u9() {
      return this.c8 == null ? null : (byte[])this.c8.clone();
   }

   public void n5(byte[] var1) {
      this.c8 = var1;
   }

   public byte[] h0() {
      return this.x8 == null ? null : (byte[])this.x8.clone();
   }

   public z6 c8() {
      if (this.z1 == null) {
         j4 var1 = new j4();
         com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(this.x8);
         com.aspose.slides.internal.x8w.l6 var3 = var2.n5(0);
         if (var3 == null || var3.l6() != 2) {
            return null;
         }

         com.aspose.slides.internal.x8w.l6 var4 = var2.n5(1);
         if (var4.l6() != 2) {
            return null;
         }

         var1.h0 = this.k5(var3.u3());
         var1.c8 = var4.u3();
         int var5 = var1.h0.length << 3;
         this.z1 = new e9(var5);
         this.z1.n5(var1.n5());
      }

      return this.z1;
   }

   public void n5(z6 var1) {
      if (var1 != null) {
         this.t4 = null;
      }

      this.z1 = var1;
   }

   public byte[] t2() {
      return this.l6 == null ? null : (byte[])this.l6.clone();
   }

   public byte[] s7() {
      return this.z3 == null ? null : (byte[])this.z3.clone();
   }

   public byte[] x8() {
      if (this.n3 == null) {
         return null;
      }

      switch (j5.n5(this.y4)) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 6:
         case 7:
         case 8:
            return (byte[])this.n3.clone();
         case 5:
            com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.n3);
            if (var1 != null && var1.n5() == 2) {
               byte[] var2 = var1.n5(0).u3();
               byte[] var3 = var1.n5(1).u3();
               byte[] var4 = new byte[40];
               int var5 = q1.n5(0, var2.length - 20);
               int var6 = q1.n5(0, 20 - var2.length);
               com.aspose.slides.ms.System.y4.n5(var2, var5, var4, var6, var2.length - var5);
               int var7 = q1.n5(0, var3.length - 20);
               int var8 = q1.n5(20, 40 - var3.length);
               com.aspose.slides.ms.System.y4.n5(var3, var7, var4, var8, var3.length - var7);
               return var4;
            }

            return null;
         default:
            throw new CryptographicException(d1.n5(new String[]{"Unsupported hash algorithm: ", this.y4}));
      }
   }

   public String n3() {
      return this.y4;
   }

   public String y4() {
      return this.s7;
   }

   public j5 e2() {
      return this.k5;
   }

   public j5 t9() {
      return this.u3;
   }

   public int z1() {
      return this.q0;
   }

   public boolean t4() {
      return this.n5(com.aspose.slides.ms.System.j5.t2().m3());
   }

   public boolean n5(j5 var1) {
      return com.aspose.slides.ms.System.j5.n5(var1, this.e2()) && com.aspose.slides.ms.System.j5.u3(var1, this.t9());
   }

   boolean l6(z3 var1) {
      z8 var2 = new z8(var1);
      var2.n5(h6.class.getName());
      return var2.n5(this.k5(), this.x8());
   }

   boolean l6(z6 var1) {
      v3 var2 = new v3(var1);
      switch (j5.n5(this.y4)) {
         case 0:
            var2.n5(k7.class.getName());
            break;
         case 1:
            var2.n5(com.aspose.slides.internal.x8w.u3.class.getName());
            break;
         case 2:
            var2.n5(v4.class.getName());
            break;
         case 3:
         case 4:
            var2.n5(h6.class.getName());
            break;
         case 5:
            return false;
         case 6:
            var2.n5(i6.class.getName());
            break;
         case 7:
            var2.n5(r8.class.getName());
            break;
         case 8:
            var2.n5(y5.class.getName());
            break;
         default:
            throw new CryptographicException(d1.n5(new String[]{"Unsupported hash algorithm: ", this.y4}));
      }

      return var2.n5(this.k5(), this.x8());
   }

   public boolean n5(com.aspose.slides.internal.o8m.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("aa");
      } else if (var1 instanceof z6) {
         return this.l6((z6)var1);
      } else if (var1 instanceof z3) {
         return this.l6((z3)var1);
      } else {
         throw new NotSupportedException(d1.n5(new String[]{"Unknown Asymmetric Algorithm ", var1.toString()}));
      }
   }

   public boolean q0() {
      if (!d1.a6(this.u9, this.s7)) {
         return false;
      }

      try {
         if (this.c8() != null) {
            return this.l6(this.c8());
         } else {
            return this.n5() != null ? this.l6(this.n5()) : false;
         }
      } catch (CryptographicException var2) {
         return false;
      }
   }

   public com.aspose.slides.internal.x8w.l6 z3() {
      return this.a6;
   }

   public com.aspose.slides.internal.x8w.l6 m1() {
      return this.t2;
   }

   static byte[] n5(String var0, byte[] var1) {
      String var2 = com.aspose.slides.internal.l7h.j5.e2().l6(var1);
      String var3 = d1.n5("-----BEGIN {0}-----", new Object[]{var0});
      String var4 = d1.n5("-----END {0}-----", new Object[]{var0});
      int var5 = d1.c8(var2, var3) + var3.length();
      int var6 = d1.n5(var2, var4, var5);
      String var7 = d1.l6(var2, var5, var6 - var5);
      return com.aspose.slides.ms.System.z3.s7(var7);
   }
}
