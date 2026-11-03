package com.aspose.slides.internal.i2i;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.o8m.f2;
import com.aspose.slides.internal.o8m.h6;
import com.aspose.slides.internal.o8m.v3;
import com.aspose.slides.internal.o8m.v4;
import com.aspose.slides.internal.o8m.z3;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.internal.o8m.z8;
import com.aspose.slides.internal.x8w.k7;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.q1;

public class y4 {
   private String n5;
   private byte l6;
   private j5 k5 = new j5();
   private j5 u3 = new j5();
   private ArrayList a6;
   private String u9;
   private byte[] h0;
   private u9 c8;
   private byte[] t2;
   private byte[] s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "1.2.840.10040.4.3", "1.2.840.113549.1.1.2", "1.2.840.113549.1.1.4", "1.2.840.113549.1.1.5"
   );

   public y4(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("crl");
      }

      this.t2 = (byte[])var1.clone();
      this.l6(this.t2);
   }

   private void l6(byte[] var1) {
      String var2 = "Input data cannot be coded as a valid CRL.";

      try {
         com.aspose.slides.internal.x8w.l6 var3 = new com.aspose.slides.internal.x8w.l6(this.t2);
         if (var3.l6() == 48 && var3.n5() == 3) {
            com.aspose.slides.internal.x8w.l6 var4 = var3.n5(0);
            if (var4.l6() == 48 && var4.n5() >= 3) {
               int var5 = 0;
               if (var4.n5(var5).l6() == 2) {
                  this.l6 = (byte)(var4.n5(var5++).u3()[0] + 1);
               } else {
                  this.l6 = 1;
               }

               this.u9 = com.aspose.slides.internal.x8w.k5.l6(var4.n5(var5++).n5(0));
               this.n5 = n3.n5(var4.n5(var5++));
               this.k5 = com.aspose.slides.internal.x8w.k5.k5(var4.n5(var5++));
               com.aspose.slides.internal.x8w.l6 var6 = var4.n5(var5++);
               if (var6.l6() == 23 || var6.l6() == 24) {
                  this.u3 = com.aspose.slides.internal.x8w.k5.k5(var6);
                  var6 = var4.n5(var5++);
               }

               this.a6 = new ArrayList();
               if (var6 != null && var6.l6() == 48) {
                  for (int var7 = 0; var7 < var6.n5(); var7++) {
                     this.a6.addItem(new y4$n5(var6.n5(var7)));
                  }
               } else {
                  var5--;
               }

               com.aspose.slides.internal.x8w.l6 var15 = var4.n5(var5);
               if (var15 != null && (var15.l6() & 255) == 160 && var15.n5() == 1) {
                  this.c8 = new u9(var15.n5(0));
               } else {
                  this.c8 = new u9(null);
               }

               String var8 = com.aspose.slides.internal.x8w.k5.l6(var3.n5(1).n5(0));
               if (!d1.a6(this.u9, var8)) {
                  throw new CryptographicException(d1.n5(new String[]{var2, " [Non-matching signature algorithms in CRL]"}));
               }

               byte[] var9 = var3.n5(2).u3();
               this.h0 = new byte[var9.length - 1];
               com.aspose.slides.ms.System.y4.n5(var9, 1, this.h0, 0, this.h0.length);
            } else {
               throw new CryptographicException(var2);
            }
         } else {
            throw new CryptographicException(var2);
         }
      } catch (Exception var10) {
         throw new CryptographicException(var2);
      }
   }

   public u9 n5() {
      return this.c8;
   }

   public byte[] l6() {
      if (this.s7 == null) {
         com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.t2);
         byte[] var2 = var1.n5(0).a6();
         f2 var3 = f2.k5(this.a6());
         this.s7 = var3.l6(var2);
      }

      return this.s7;
   }

   public String k5() {
      return this.n5;
   }

   public j5 u3() {
      return this.u3;
   }

   private boolean n5(byte[] var1, byte[] var2) {
      if (var1 == null && var2 == null) {
         return true;
      }

      if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            return false;
         }

         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var1[var3] != var2[var3]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public y4$n5 n5(l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("x509");
      } else {
         return this.n5(var1.s7());
      }
   }

   public y4$n5 n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("serialNumber");
      }

      for (int var2 = 0; var2 < this.a6.size(); var2++) {
         y4$n5 var3 = (y4$n5)this.a6.get_Item(var2);
         if (this.n5(var1, var3.n5())) {
            return var3;
         }
      }

      return null;
   }

   private String a6() {
      switch (x8.n5(this.u9)) {
         case 0:
         case 3:
            return h6.class.getName();
         case 1:
            return k7.class.getName();
         case 2:
            return v4.class.getName();
         default:
            throw new CryptographicException(d1.n5(new String[]{"Unsupported hash algorithm: ", this.u9}));
      }
   }

   boolean n5(z3 var1) {
      if (!"1.2.840.10040.4.3".equals(this.u9)) {
         throw new CryptographicException(d1.n5(new String[]{"Unsupported hash algorithm: ", this.u9}));
      } else {
         z8 var2 = new z8(var1);
         var2.n5(h6.class.getName());
         com.aspose.slides.internal.x8w.l6 var3 = new com.aspose.slides.internal.x8w.l6(this.h0);
         if (var3 != null && var3.n5() == 2) {
            byte[] var4 = var3.n5(0).u3();
            byte[] var5 = var3.n5(1).u3();
            byte[] var6 = new byte[40];
            int var7 = q1.n5(0, var4.length - 20);
            int var8 = q1.n5(0, 20 - var4.length);
            com.aspose.slides.ms.System.y4.n5(var4, var7, var6, var8, var4.length - var7);
            int var9 = q1.n5(0, var5.length - 20);
            int var10 = q1.n5(20, 40 - var5.length);
            com.aspose.slides.ms.System.y4.n5(var5, var9, var6, var10, var5.length - var9);
            return var2.n5(this.l6(), var6);
         } else {
            return false;
         }
      }
   }

   boolean n5(z6 var1) {
      v3 var2 = new v3(var1);
      var2.n5(this.a6());
      return var2.n5(this.l6(), this.h0);
   }

   public boolean n5(com.aspose.slides.internal.o8m.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("aa");
      } else if (var1 instanceof z6) {
         return this.n5((z6)var1);
      } else if (var1 instanceof z3) {
         return this.n5((z3)var1);
      } else {
         throw new NotSupportedException(d1.n5(new String[]{"Unknown Asymmetric Algorithm ", var1.toString()}));
      }
   }
}
