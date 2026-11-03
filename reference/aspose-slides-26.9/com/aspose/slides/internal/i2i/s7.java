package com.aspose.slides.internal.i2i;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o8m.d2;
import com.aspose.slides.internal.o8m.i1;
import com.aspose.slides.internal.o8m.i9;
import com.aspose.slides.internal.o8m.m3;
import com.aspose.slides.internal.o8m.u8;
import com.aspose.slides.internal.o8m.z3;
import com.aspose.slides.internal.x8w.w1$l6;
import com.aspose.slides.internal.x8w.w1$n5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.v4;

public class s7 implements v4 {
   private static int n5 = 2000;
   private byte[] l6;
   private ArrayList k5;
   private ArrayList u3;
   private k5 a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private int t2 = n5;
   private ArrayList s7;
   private i9 x8;
   private static int n3 = Integer.MAX_VALUE;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "1.2.840.113549.1.5.1",
      "1.2.840.113549.1.5.3",
      "1.2.840.113549.1.5.4",
      "1.2.840.113549.1.5.6",
      "1.2.840.113549.1.5.10",
      "1.2.840.113549.1.5.11",
      "1.2.840.113549.1.12.1.1",
      "1.2.840.113549.1.12.1.2",
      "1.2.840.113549.1.12.1.3",
      "1.2.840.113549.1.12.1.4",
      "1.2.840.113549.1.12.1.5",
      "1.2.840.113549.1.12.1.6",
      "1.2.840.113549.1.12.10.1.1",
      "1.2.840.113549.1.12.10.1.2",
      "1.2.840.113549.1.12.10.1.3",
      "1.2.840.113549.1.12.10.1.4",
      "1.2.840.113549.1.12.10.1.5",
      "1.2.840.113549.1.12.10.1.6",
      "1.2.840.113549.1.9.20",
      "1.2.840.113549.1.9.21"
   );

   public s7() {
      this.k5 = new ArrayList();
      this.u3 = new ArrayList();
      this.a6 = new k5();
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.s7 = new ArrayList();
   }

   public s7(byte[] var1) {
      this();
      this.n5((String)null);
      this.n5(var1);
   }

   public s7(byte[] var1, String var2) {
      this();
      this.n5(var2);
      this.n5(var1);
   }

   private void n5(byte[] var1) {
      com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(var1);
      if (var2.l6() != 48) {
         throw new ArgumentException("invalid data");
      }

      com.aspose.slides.internal.x8w.l6 var3 = var2.n5(0);
      if (var3.l6() != 2) {
         throw new ArgumentException("invalid PFX version");
      }

      n5$n5 var4 = new n5$n5(var2.n5(1));
      if (!var4.k5().equals("1.2.840.113549.1.7.1")) {
         throw new ArgumentException("invalid authenticated safe");
      }

      if (var2.n5() > 2) {
         com.aspose.slides.internal.x8w.l6 var5 = var2.n5(2);
         if (var5.l6() != 48) {
            throw new ArgumentException("invalid MAC");
         }

         com.aspose.slides.internal.x8w.l6 var6 = var5.n5(0);
         if (var6.l6() != 48) {
            throw new ArgumentException("invalid MAC");
         }

         com.aspose.slides.internal.x8w.l6 var7 = var6.n5(0);
         String var8 = com.aspose.slides.internal.x8w.k5.l6(var7.n5(0));
         if (!"1.3.14.3.2.26".equals(var8)) {
            throw new ArgumentException("unsupported HMAC");
         }

         byte[] var9 = var6.n5(1).u3();
         com.aspose.slides.internal.x8w.l6 var10 = var5.n5(1);
         if (var10.l6() != 4) {
            throw new ArgumentException("missing MAC salt");
         }

         this.t2 = 1;
         if (var5.n5() > 2) {
            com.aspose.slides.internal.x8w.l6 var11 = var5.n5(2);
            if (var11.l6() != 2) {
               throw new ArgumentException("invalid MAC iteration");
            }

            this.t2 = com.aspose.slides.internal.x8w.k5.n5(var11);
         }

         byte[] var22 = var4.l6().n5(0).u3();
         byte[] var12 = this.n5(this.l6, var10.u3(), this.t2, var22);
         if (!this.n5(var9, var12)) {
            throw new t2("Invalid MAC - file may have been tampered!");
         }
      }

      com.aspose.slides.internal.x8w.l6 var13 = new com.aspose.slides.internal.x8w.l6(var4.l6().n5(0).u3());

      for (int var14 = 0; var14 < var13.n5(); var14++) {
         n5$n5 var15 = new n5$n5(var13.n5(var14));
         if (var15.k5().equals("1.2.840.113549.1.7.1")) {
            com.aspose.slides.internal.x8w.l6 var17 = new com.aspose.slides.internal.x8w.l6(var15.l6().n5(0).u3());

            for (int var19 = 0; var19 < var17.n5(); var19++) {
               com.aspose.slides.internal.x8w.l6 var21 = var17.n5(var19);
               this.n5(var21);
            }
         } else {
            if (!var15.k5().equals("1.2.840.113549.1.7.6")) {
               if (var15.k5().equals("1.2.840.113549.1.7.3")) {
                  throw new NotImplementedException("public key encrypted");
               }

               throw new ArgumentException("unknown authenticatedSafe");
            }

            n5$l6 var16 = new n5$l6(var15.l6().n5(0));
            com.aspose.slides.internal.x8w.l6 var18 = new com.aspose.slides.internal.x8w.l6(this.n5(var16));

            for (int var20 = 0; var20 < var18.n5(); var20++) {
               com.aspose.slides.internal.x8w.l6 var23 = var18.n5(var20);
               this.n5(var23);
            }
         }
      }
   }

   public void n5(String var1) {
      if (var1 != null) {
         if (var1.length() > 0) {
            int var2 = var1.length();
            byte var3 = 0;
            if (var2 < u9()) {
               if (var1.charAt(var2 - 1) != 0) {
                  var3 = 1;
               }
            } else {
               var2 = u9();
            }

            this.l6 = new byte[var2 + var3 << 1];
            j5.t4().n5(var1, 0, var2, this.l6, 0);
         } else {
            this.l6 = new byte[2];
         }
      } else {
         this.l6 = null;
      }
   }

   public int n5() {
      return this.t2;
   }

   public void n5(int var1) {
      this.t2 = var1;
   }

   public ArrayList l6() {
      if (this.u9) {
         this.k5.clear();

         for (Object recoveredElement$var2$6373 : this.s7) {
            x8 var2 = (x8)recoveredElement$var2$6373;
            if (d1.a6(var2.n5(), "1.2.840.113549.1.12.10.1.1")) {
               com.aspose.slides.internal.x8w.l6 var3 = var2.l6();
               com.aspose.slides.internal.x8w.l6 var4 = var3.n5(1);
               w1$l6 var5 = new w1$l6(var4.u3());
               byte[] var6 = var5.n5();
               switch (var6[0]) {
                  case 2:
                     m3 var7 = new m3();
                     this.k5.addItem(w1$l6.n5(var6, var7.n5()));
                     break;
                  case 48:
                     this.k5.addItem(w1$l6.n5(var6));
               }

               com.aspose.slides.ms.System.u3.n5(var6, 0, var6.length);
            } else if (d1.a6(var2.n5(), "1.2.840.113549.1.12.10.1.2")) {
               com.aspose.slides.internal.x8w.l6 var10 = var2.l6();
               com.aspose.slides.internal.x8w.l6 var11 = var10.n5(1);
               w1$n5 var12 = new w1$n5(var11.u3());
               byte[] var13 = this.n5(var12.n5(), var12.k5(), var12.u3(), var12.l6());
               w1$l6 var14 = new w1$l6(var13);
               byte[] var8 = var14.n5();
               switch (var8[0]) {
                  case 2:
                     m3 var9 = new m3();
                     this.k5.addItem(w1$l6.n5(var8, var9.n5()));
                     break;
                  case 48:
                     this.k5.addItem(w1$l6.n5(var8));
               }

               com.aspose.slides.ms.System.u3.n5(var8, 0, var8.length);
               com.aspose.slides.ms.System.u3.n5(var13, 0, var13.length);
            }
         }

         this.u9 = false;
      }

      return ArrayList.readOnly(this.k5);
   }

   public k5 k5() {
      if (this.c8) {
         this.a6.clear();

         for (Object recoveredElement$var2$8118 : this.s7) {
            x8 var2 = (x8)recoveredElement$var2$8118;
            if (d1.a6(var2.n5(), "1.2.840.113549.1.12.10.1.3")) {
               com.aspose.slides.internal.x8w.l6 var3 = var2.l6();
               com.aspose.slides.internal.x8w.l6 var4 = var3.n5(1);
               n5$n5 var5 = new n5$n5(var4.u3());
               this.a6.n5(new l6(var5.l6().n5(0).u3()));
            }
         }

         this.c8 = false;
      }

      return this.a6;
   }

   i9 u3() {
      if (this.x8 == null) {
         this.x8 = i9.n5();
      }

      return this.x8;
   }

   private boolean n5(byte[] var1, byte[] var2) {
      boolean var3 = false;
      if (var1.length == var2.length) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            if (var1[var4] != var2[var4]) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   private u8 n5(String var1, byte[] var2, int var3) {
      String var4 = null;
      byte var5 = 8;
      byte var6 = 8;
      s7$n5 var7 = new s7$n5();
      var7.n5(this.l6);
      var7.l6(var2);
      var7.n5(var3);
      switch (y4.n5(var1)) {
         case 0:
            var7.n5("MD2");
            var4 = "DES";
            break;
         case 1:
            var7.n5("MD5");
            var4 = "DES";
            break;
         case 2:
            var7.n5("MD2");
            var4 = "RC2";
            var5 = 4;
            break;
         case 3:
            var7.n5("MD5");
            var4 = "RC2";
            var5 = 4;
            break;
         case 4:
            var7.n5("SHA1");
            var4 = "DES";
            break;
         case 5:
            var7.n5("SHA1");
            var4 = "RC2";
            var5 = 4;
            break;
         case 6:
            var7.n5("SHA1");
            var4 = "RC4";
            var5 = 16;
            var6 = 0;
            break;
         case 7:
            var7.n5("SHA1");
            var4 = "RC4";
            var5 = 5;
            var6 = 0;
            break;
         case 8:
            var7.n5("SHA1");
            var4 = "TripleDES";
            var5 = 24;
            break;
         case 9:
            var7.n5("SHA1");
            var4 = "TripleDES";
            var5 = 16;
            break;
         case 10:
            var7.n5("SHA1");
            var4 = "RC2";
            var5 = 16;
            break;
         case 11:
            var7.n5("SHA1");
            var4 = "RC2";
            var5 = 5;
            break;
         default:
            throw new NotSupportedException(d1.n5(new String[]{"unknown oid ", var4}));
      }

      u8 var8 = u8.l6(var4);
      var8.k5(var7.l6(var5));
      if (var6 > 0) {
         var8.u3(var7.k5(var6));
         var8.k5(1);
      }

      return var8;
   }

   public byte[] n5(String var1, byte[] var2, int var3, byte[] var4) {
      u8 var5 = null;
      byte[] var6 = null;

      try {
         var5 = this.n5(var1, var2, var3);
         i1 var7 = var5.e2();
         var6 = var7.n5(var4, 0, var4.length);
      } finally {
         if (var5 != null) {
            var5.h0();
         }
      }

      return (byte[])var6;
   }

   public byte[] n5(n5$l6 var1) {
      return this.n5(var1.n5().k5(), var1.n5().l6().n5(0).u3(), com.aspose.slides.internal.x8w.k5.n5(var1.n5().l6().n5(1)), var1.l6());
   }

   public byte[] l6(String var1, byte[] var2, int var3, byte[] var4) {
      byte[] var5 = null;
      u8 var6 = this.n5(var1, var2, var3);

      try {
         i1 var7 = var6.t9();
         var5 = var7.n5(var4, 0, var4.length);
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return (byte[])var5;
   }

   private m3 n5(boolean[] var1) {
      for (Object recoveredElement$var3$11797 : this.k5()) {
         l6 var3 = (l6)recoveredElement$var3$11797;
         if (var3.u9() != null) {
            z3 var4 = var3.n5();
            if (var4 != null) {
               var1[0] = true;
               return var4.l6(false);
            }
         }
      }

      var1[0] = false;
      return new m3();
   }

   private void n5(w1$l6 var1) {
      byte[] var2 = var1.n5();
      switch (var2[0]) {
         case 2:
            boolean var3 = false;
            boolean[] var4 = new boolean[]{false};
            m3 var5 = this.n5(var4).n5();
            var3 = var4[0];
            if (var3) {
               this.k5.addItem(w1$l6.n5(var2, var5.n5()));
            }
            break;
         case 48:
            this.k5.addItem(w1$l6.n5(var2));
            break;
         default:
            com.aspose.slides.ms.System.u3.n5(var2, 0, var2.length);
            throw new CryptographicException("Unknown private key format");
      }

      com.aspose.slides.ms.System.u3.n5(var2, 0, var2.length);
   }

   private void n5(com.aspose.slides.internal.x8w.l6 var1) {
      if (var1.l6() != 48) {
         throw new ArgumentException("invalid safeBag");
      }

      com.aspose.slides.internal.x8w.l6 var2 = var1.n5(0);
      if (var2.l6() != 6) {
         throw new ArgumentException("invalid safeBag id");
      }

      com.aspose.slides.internal.x8w.l6 var3 = var1.n5(1);
      String var4 = com.aspose.slides.internal.x8w.k5.l6(var2);
      switch (y4.n5(var4)) {
         case 12:
            this.n5(new w1$l6(var3.u3()));
            break;
         case 13:
            w1$n5 var5 = new w1$n5(var3.u3());
            byte[] var6 = this.n5(var5.n5(), var5.k5(), var5.u3(), var5.l6());
            this.n5(new w1$l6(var6));
            com.aspose.slides.ms.System.u3.n5(var6, 0, var6.length);
            break;
         case 14:
            n5$n5 var7 = new n5$n5(var3.u3());
            if (!"1.2.840.113549.1.9.22.1".equals(var7.k5())) {
               throw new NotSupportedException("unsupport certificate type");
            }

            l6 var8 = new l6(var7.l6().n5(0).u3());
            this.a6.n5(var8);
         case 15:
         case 17:
            break;
         case 16:
            byte[] var9 = var3.u3();
            this.u3.addItem(var9);
            break;
         default:
            throw new ArgumentException("unknown safeBag oid");
      }

      if (var1.n5() > 2) {
         com.aspose.slides.internal.x8w.l6 var13 = var1.n5(2);
         if (var13.l6() != 49) {
            throw new ArgumentException("invalid safeBag attributes id");
         }

         for (int var14 = 0; var14 < var13.n5(); var14++) {
            com.aspose.slides.internal.x8w.l6 var15 = var13.n5(var14);
            if (var15.l6() != 48) {
               throw new ArgumentException("invalid PKCS12 attributes id");
            }

            com.aspose.slides.internal.x8w.l6 var16 = var15.n5(0);
            if (var16.l6() != 6) {
               throw new ArgumentException("invalid attribute id");
            }

            String var17 = com.aspose.slides.internal.x8w.k5.l6(var16);
            com.aspose.slides.internal.x8w.l6 var10 = var15.n5(1);

            for (int var11 = 0; var11 < var10.n5(); var11++) {
               com.aspose.slides.internal.x8w.l6 var12 = var10.n5(var11);
               switch (y4.n5(var17)) {
                  case 18:
                     if (var12.l6() != 30) {
                        throw new ArgumentException("invalid attribute value id");
                     }
                     break;
                  case 19:
                     if (var12.l6() != 4) {
                        throw new ArgumentException("invalid attribute value id");
                     }
               }
            }
         }
      }

      this.s7.addItem(new x8(var4, var1));
   }

   private com.aspose.slides.internal.x8w.l6 k5(l6 var1, IDictionary var2) {
      com.aspose.slides.internal.x8w.l6 var3 = new com.aspose.slides.internal.x8w.l6((byte)4, var1.t2());
      n5$n5 var4 = new n5$n5();
      var4.n5("1.2.840.113549.1.9.22.1");
      var4.l6().n5(var3);
      com.aspose.slides.internal.x8w.l6 var5 = new com.aspose.slides.internal.x8w.l6((byte)-96);
      var5.n5(var4.n5());
      com.aspose.slides.internal.x8w.l6 var6 = new com.aspose.slides.internal.x8w.l6((byte)48);
      var6.n5(com.aspose.slides.internal.x8w.k5.n5("1.2.840.113549.1.12.10.1.3"));
      var6.n5(var5);
      if (var2 != null) {
         com.aspose.slides.internal.x8w.l6 var7 = new com.aspose.slides.internal.x8w.l6((byte)49);
         IDictionaryEnumerator var8 = var2.iterator();

         while (var8.hasNext()) {
            String var9 = (String)var8.getKey();
            switch (y4.n5(var9)) {
               case 18:
                  ArrayList var10 = (ArrayList)var8.getValue();
                  if (var10.size() <= 0) {
                     break;
                  }

                  com.aspose.slides.internal.x8w.l6 var17 = new com.aspose.slides.internal.x8w.l6((byte)48);
                  var17.n5(com.aspose.slides.internal.x8w.k5.n5("1.2.840.113549.1.9.20"));
                  com.aspose.slides.internal.x8w.l6 var18 = new com.aspose.slides.internal.x8w.l6((byte)49);

                  for (Object recoveredElement$var20$17016 : var10) {
                     byte[] var20 = (byte[])recoveredElement$var20$17016;
                     com.aspose.slides.internal.x8w.l6 var21 = new com.aspose.slides.internal.x8w.l6((byte)30);
                     var21.n5(var20);
                     var18.n5(var21);
                  }

                  var17.n5(var18);
                  var7.n5(var17);
                  break;
               case 19:
                  ArrayList var11 = (ArrayList)var8.getValue();
                  if (var11.size() > 0) {
                     com.aspose.slides.internal.x8w.l6 var12 = new com.aspose.slides.internal.x8w.l6((byte)48);
                     var12.n5(com.aspose.slides.internal.x8w.k5.n5("1.2.840.113549.1.9.21"));
                     com.aspose.slides.internal.x8w.l6 var13 = new com.aspose.slides.internal.x8w.l6((byte)49);

                     for (Object recoveredElement$var15$17818 : var11) {
                        byte[] var15 = (byte[])recoveredElement$var15$17818;
                        com.aspose.slides.internal.x8w.l6 var16 = new com.aspose.slides.internal.x8w.l6((byte)4);
                        var16.n5(var15);
                        var13.n5(var16);
                     }

                     var12.n5(var13);
                     var7.n5(var12);
                  }
            }
         }

         if (var7.n5() > 0) {
            var6.n5(var7);
         }
      }

      return var6;
   }

   private byte[] n5(byte[] var1, byte[] var2, int var3, byte[] var4) {
      s7$n5 var5 = new s7$n5();
      var5.n5("SHA1");
      var5.n5(var1);
      var5.l6(var2);
      var5.n5(var3);
      d2 var6 = (d2)d2.s7();
      var6.n5(var5.u3(20));
      return var6.k5(var4, 0, var4.length);
   }

   public byte[] a6() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6((byte)48);
      ArrayList var2 = new ArrayList();

      for (Object recoveredElement$var4$18754 : this.s7) {
         x8 var4 = (x8)recoveredElement$var4$18754;
         if (d1.a6(var4.n5(), "1.2.840.113549.1.12.10.1.3")) {
            com.aspose.slides.internal.x8w.l6 var5 = var4.l6();
            com.aspose.slides.internal.x8w.l6 var6 = var5.n5(1);
            n5$n5 var7 = new n5$n5(var6.u3());
            var2.addItem(new l6(var7.l6().n5(0).u3()));
         }
      }

      ArrayList var13 = new ArrayList();
      ArrayList var14 = new ArrayList();

      for (Object recoveredElement$var23$19184 : this.k5()) {
         l6 var23 = (l6)recoveredElement$var23$19184;
         boolean var34 = false;

         for (Object recoveredElement$var9$19255 : var2) {
            l6 var9 = (l6)recoveredElement$var9$19255;
            if (this.n5(var23.t2(), var9.t2())) {
               var34 = true;
            }
         }

         if (!var34) {
            var13.addItem(var23);
         }
      }

      for (Object recoveredElement$var24$19466 : var2) {
         l6 var24 = (l6)recoveredElement$var24$19466;
         boolean var35 = false;

         for (Object recoveredElement$var43$19532 : this.k5()) {
            l6 var43 = (l6)recoveredElement$var43$19532;
            if (this.n5(var24.t2(), var43.t2())) {
               var35 = true;
            }
         }

         if (!var35) {
            var14.addItem(var24);
         }
      }

      for (Object recoveredElement$var25$19750 : var14) {
         l6 var25 = (l6)recoveredElement$var25$19750;
         this.l6(var25);
      }

      for (Object recoveredElement$var26$19815 : var13) {
         l6 var26 = (l6)recoveredElement$var26$19815;
         this.n5(var26);
      }

      if (this.s7.size() > 0) {
         com.aspose.slides.internal.x8w.l6 var19 = new com.aspose.slides.internal.x8w.l6((byte)48);

         for (Object recoveredElement$var36$20016 : this.s7) {
            x8 var36 = (x8)recoveredElement$var36$20016;
            if (d1.a6(var36.n5(), "1.2.840.113549.1.12.10.1.3")) {
               var19.n5(var36.l6());
            }
         }

         if (var19.n5() > 0) {
            n5$n5 var28 = this.n5(var19, "1.2.840.113549.1.12.1.3");
            var1.n5(var28.n5());
         }
      }

      if (this.s7.size() > 0) {
         com.aspose.slides.internal.x8w.l6 var20 = new com.aspose.slides.internal.x8w.l6((byte)48);

         for (Object recoveredElement$var37$20468 : this.s7) {
            x8 var37 = (x8)recoveredElement$var37$20468;
            if (d1.a6(var37.n5(), "1.2.840.113549.1.12.10.1.1") || d1.a6(var37.n5(), "1.2.840.113549.1.12.10.1.2")) {
               var20.n5(var37.l6());
            }
         }

         if (var20.n5() > 0) {
            com.aspose.slides.internal.x8w.l6 var30 = new com.aspose.slides.internal.x8w.l6((byte)-96);
            var30.n5(new com.aspose.slides.internal.x8w.l6((byte)4, var20.a6()));
            n5$n5 var38 = new n5$n5("1.2.840.113549.1.7.1");
            var38.n5(var30);
            var1.n5(var38.n5());
         }
      }

      if (this.s7.size() > 0) {
         com.aspose.slides.internal.x8w.l6 var21 = new com.aspose.slides.internal.x8w.l6((byte)48);

         for (Object recoveredElement$var39$21178 : this.s7) {
            x8 var39 = (x8)recoveredElement$var39$21178;
            if (d1.a6(var39.n5(), "1.2.840.113549.1.12.10.1.5")) {
               var21.n5(var39.l6());
            }
         }

         if (var21.n5() > 0) {
            n5$n5 var32 = this.n5(var21, "1.2.840.113549.1.12.1.3");
            var1.n5(var32.n5());
         }
      }

      com.aspose.slides.internal.x8w.l6 var22 = new com.aspose.slides.internal.x8w.l6((byte)4, var1.a6());
      com.aspose.slides.internal.x8w.l6 var33 = new com.aspose.slides.internal.x8w.l6((byte)-96);
      var33.n5(var22);
      n5$n5 var40 = new n5$n5("1.2.840.113549.1.7.1");
      var40.n5(var33);
      com.aspose.slides.internal.x8w.l6 var42 = new com.aspose.slides.internal.x8w.l6((byte)48);
      if (this.l6 != null) {
         byte[] var44 = new byte[20];
         this.u3().n5(var44);
         byte[] var10 = this.n5(this.l6, var44, this.t2, var40.l6().n5(0).u3());
         com.aspose.slides.internal.x8w.l6 var11 = new com.aspose.slides.internal.x8w.l6((byte)48);
         var11.n5(com.aspose.slides.internal.x8w.k5.n5("1.3.14.3.2.26"));
         var11.n5(new com.aspose.slides.internal.x8w.l6((byte)5));
         com.aspose.slides.internal.x8w.l6 var12 = new com.aspose.slides.internal.x8w.l6((byte)48);
         var12.n5(var11);
         var12.n5(new com.aspose.slides.internal.x8w.l6((byte)4, var10));
         var42.n5(var12);
         var42.n5(new com.aspose.slides.internal.x8w.l6((byte)4, var44));
         var42.n5(com.aspose.slides.internal.x8w.k5.n5(this.t2));
      }

      com.aspose.slides.internal.x8w.l6 var45 = new com.aspose.slides.internal.x8w.l6((byte)2, new byte[]{3});
      com.aspose.slides.internal.x8w.l6 var46 = new com.aspose.slides.internal.x8w.l6((byte)48);
      var46.n5(var45);
      var46.n5(var40.n5());
      if (var42.n5() > 0) {
         var46.n5(var42);
      }

      return var46.a6();
   }

   private n5$n5 n5(com.aspose.slides.internal.x8w.l6 var1, String var2) {
      byte[] var3 = new byte[8];
      this.u3().n5(var3);
      com.aspose.slides.internal.x8w.l6 var4 = new com.aspose.slides.internal.x8w.l6((byte)48);
      var4.n5(new com.aspose.slides.internal.x8w.l6((byte)4, var3));
      var4.n5(com.aspose.slides.internal.x8w.k5.n5(this.t2));
      com.aspose.slides.internal.x8w.l6 var5 = new com.aspose.slides.internal.x8w.l6((byte)48);
      var5.n5(com.aspose.slides.internal.x8w.k5.n5(var2));
      var5.n5(var4);
      byte[] var6 = this.l6(var2, var3, this.t2, var1.a6());
      com.aspose.slides.internal.x8w.l6 var7 = new com.aspose.slides.internal.x8w.l6((byte)-128, var6);
      com.aspose.slides.internal.x8w.l6 var8 = new com.aspose.slides.internal.x8w.l6((byte)48);
      var8.n5(com.aspose.slides.internal.x8w.k5.n5("1.2.840.113549.1.7.1"));
      var8.n5(var5);
      var8.n5(var7);
      com.aspose.slides.internal.x8w.l6 var9 = new com.aspose.slides.internal.x8w.l6((byte)2, new byte[]{0});
      com.aspose.slides.internal.x8w.l6 var10 = new com.aspose.slides.internal.x8w.l6((byte)48);
      var10.n5(var9);
      var10.n5(var8);
      com.aspose.slides.internal.x8w.l6 var11 = new com.aspose.slides.internal.x8w.l6((byte)-96);
      var11.n5(var10);
      n5$n5 var12 = new n5$n5("1.2.840.113549.1.7.6");
      var12.n5(var11);
      return var12;
   }

   public void n5(l6 var1) {
      this.n5(var1, null);
   }

   public void n5(l6 var1, IDictionary var2) {
      boolean var3 = false;

      for (int var4 = 0; !var3 && var4 < this.s7.size(); var4++) {
         x8 var5 = (x8)this.s7.get_Item(var4);
         if (d1.a6(var5.n5(), "1.2.840.113549.1.12.10.1.3")) {
            com.aspose.slides.internal.x8w.l6 var6 = var5.l6();
            com.aspose.slides.internal.x8w.l6 var7 = var6.n5(1);
            n5$n5 var8 = new n5$n5(var7.u3());
            l6 var9 = new l6(var8.l6().n5(0).u3());
            if (this.n5(var1.t2(), var9.t2())) {
               var3 = true;
            }
         }
      }

      if (!var3) {
         this.s7.addItem(new x8("1.2.840.113549.1.12.10.1.3", this.k5(var1, var2)));
         this.c8 = true;
      }
   }

   public void l6(l6 var1) {
      this.l6(var1, null);
   }

   public void l6(l6 var1, IDictionary var2) {
      int var3 = -1;

      for (int var4 = 0; var3 == -1 && var4 < this.s7.size(); var4++) {
         x8 var5 = (x8)this.s7.get_Item(var4);
         if (d1.a6(var5.n5(), "1.2.840.113549.1.12.10.1.3")) {
            com.aspose.slides.internal.x8w.l6 var6 = var5.l6();
            com.aspose.slides.internal.x8w.l6 var7 = var6.n5(1);
            n5$n5 var8 = new n5$n5(var7.u3());
            l6 var9 = new l6(var8.l6().n5(0).u3());
            if (this.n5(var1.t2(), var9.t2())) {
               if (var2 != null) {
                  if (var6.n5() == 3) {
                     com.aspose.slides.internal.x8w.l6 var10 = var6.n5(2);
                     int var11 = 0;

                     for (int var12 = 0; var12 < var10.n5(); var12++) {
                        com.aspose.slides.internal.x8w.l6 var13 = var10.n5(var12);
                        com.aspose.slides.internal.x8w.l6 var14 = var13.n5(0);
                        String var15 = com.aspose.slides.internal.x8w.k5.l6(var14);
                        ArrayList var16 = (ArrayList)var2.get_Item(var15);
                        if (var16 != null) {
                           com.aspose.slides.internal.x8w.l6 var17 = var13.n5(1);
                           if (var16.size() == var17.n5()) {
                              int var18 = 0;

                              for (int var19 = 0; var19 < var17.n5(); var19++) {
                                 com.aspose.slides.internal.x8w.l6 var20 = var17.n5(var19);
                                 byte[] var21 = (byte[])var16.get_Item(var19);
                                 if (this.n5(var21, var20.u3())) {
                                    var18++;
                                 }
                              }

                              if (var18 == var17.n5()) {
                                 var11++;
                              }
                           }
                        }
                     }

                     if (var11 == var10.n5()) {
                        var3 = var4;
                     }
                  }
               } else {
                  var3 = var4;
               }
            }
         }
      }

      if (var3 != -1) {
         this.s7.removeAt(var3);
         this.c8 = true;
      }
   }

   @Override
   public Object deepClone() {
      s7 var1 = null;
      if (this.l6 != null) {
         var1 = new s7(this.a6(), j5.t4().l6(this.l6));
      } else {
         var1 = new s7(this.a6());
      }

      var1.n5(this.n5());
      return var1;
   }

   public static int u9() {
      return n3;
   }
}
