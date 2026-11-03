package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.e9;
import com.aspose.slides.internal.o8m.u6;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public class h0 extends u9 {
   private boolean k5;
   private k7 u3;
   private String a6 = d1.n5;
   private String u9;
   private n5 h0;
   private u3 c8;
   private u3 t2;
   private u6 s7;
   private com.aspose.slides.internal.i2i.l6 x8;
   private static String n3 = d1.n5("Certificate instance is empty.", new Object[]{});
   static byte[] n5 = new byte[]{85, 4, 3};
   static byte[] l6 = new byte[]{42, -122, 72, -122, -9, 13, 1, 9, 1};
   private static byte[] y4 = new byte[]{42, -122, 72, -122, -9, 13, 1, 7, 2};

   public h0() {
      this.x8 = null;
   }

   public h0(byte[] var1) {
      this.n5(var1, (String)null, 0);
   }

   public h0(byte[] var1, String var2) {
      this.n5(var1, var2, 0);
   }

   public h0(String var1, String var2) {
      this.n5(var1, var2, 0);
   }

   public h0(u9 var1) {
      super(var1);
      this.x8 = new com.aspose.slides.internal.i2i.l6(super.x8());
   }

   public k7 y4() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      if (this.u3 == null) {
         this.u3 = new k7(this.x8);
      }

      return this.u3;
   }

   public u3 e2() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      if (this.c8 == null) {
         this.c8 = new u3(this.x8.z3().a6());
      }

      return this.c8;
   }

   public com.aspose.slides.ms.System.j5 t9() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      } else {
         return this.x8.t9().q0();
      }
   }

   public com.aspose.slides.ms.System.j5 z1() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      } else {
         return this.x8.e2().q0();
      }
   }

   public com.aspose.slides.internal.o8m.a6 t4() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      try {
         if (this.x8.c8() != null) {
            e9 var4 = com.aspose.slides.internal.v6g.k5.n5(this.x8.c8(), e9.class);
            if (var4 != null) {
               return var4.u3() ? null : var4;
            }

            com.aspose.slides.internal.x8w.u9 var2 = com.aspose.slides.internal.v6g.k5.n5(this.x8.c8(), com.aspose.slides.internal.x8w.u9.class);
            if (var2 != null) {
               return var2.u3() ? null : var2;
            }

            this.x8.c8().l6(true);
            return this.x8.c8();
         }

         if (this.x8.n5() != null) {
            com.aspose.slides.internal.o8m.m1 var1 = com.aspose.slides.internal.v6g.k5.n5(this.x8.n5(), com.aspose.slides.internal.o8m.m1.class);
            if (var1 != null) {
               return var1.u3() ? null : var1;
            }

            this.x8.n5().l6(true);
            return this.x8.n5();
         }
      } catch (RuntimeException var3) {
      }

      return null;
   }

   public void n5(com.aspose.slides.internal.o8m.a6 var1) {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      if (var1 == null) {
         this.x8.n5((z6)null);
         this.x8.n5((com.aspose.slides.internal.o8m.z3)null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, z6.class)) {
         this.x8.n5((z6)var1);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.o8m.z3.class)) {
            throw new NotSupportedException();
         }

         this.x8.n5((com.aspose.slides.internal.o8m.z3)var1);
      }
   }

   public n5 q0() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      if (this.h0 == null) {
         try {
            this.h0 = new n5(this.x8);
         } catch (RuntimeException var3) {
            String var2 = d1.n5("Unable to decode public key.", new Object[]{});
            throw new CryptographicException(var2, var3);
         }
      }

      return this.h0;
   }

   public byte[] z3() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      } else {
         return super.x8();
      }
   }

   public String m1() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      if (this.u9 == null) {
         a5 var1 = new a5();
         byte[] var2 = this.x8.s7();

         for (int var3 = var2.length - 1; var3 >= 0; var3--) {
            var1.n5(com.aspose.slides.ms.System.e2.n5(var2[var3], "X2"));
         }

         this.u9 = var1.toString();
      }

      return this.u9;
   }

   public u6 k7() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      if (this.s7 == null) {
         this.s7 = new u6(this.x8.n3());
      }

      return this.s7;
   }

   public u3 m3() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      if (this.t2 == null) {
         this.t2 = new u3(this.x8.m1().a6());
      }

      return this.t2;
   }

   public String z8() {
      return super.a6();
   }

   public int j5() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      } else {
         return this.x8.z1();
      }
   }

   public String n5(int var1, boolean var2) {
      switch (var1) {
         case 0:
            if (this.x8 == null) {
               throw new CryptographicException(n3);
            } else {
               com.aspose.slides.internal.x8w.l6 var3 = var2 ? this.x8.z3() : this.x8.m1();
               com.aspose.slides.internal.x8w.l6 var4 = this.n5(n5, var3);
               if (var4 != null) {
                  return this.n5(var4);
               } else if (var3.n5() == 0) {
                  return d1.n5;
               } else {
                  com.aspose.slides.internal.x8w.l6 var5 = var3.n5(var3.n5() - 1);
                  if (var5.n5() == 0) {
                     return d1.n5;
                  }

                  return this.n5(var5.n5(0));
               }
            }
         case 1:
            com.aspose.slides.internal.x8w.l6 var6 = this.n5(l6, var2 ? this.x8.z3() : this.x8.m1());
            if (var6 != null) {
               return this.n5(var6);
            }

            return d1.n5;
         case 2:
            return d1.n5;
         case 3:
            if (this.x8 == null) {
               throw new NullReferenceException();
            } else {
               com.aspose.slides.internal.x8w.l6 var7 = this.n5(n5, var2 ? this.x8.z3() : this.x8.m1());
               if (var7 != null) {
                  return this.n5(var7);
               }

               return d1.n5;
            }
         case 4:
            return d1.n5;
         case 5:
            return d1.n5;
         default:
            throw new ArgumentException("nameType");
      }
   }

   private com.aspose.slides.internal.x8w.l6 n5(byte[] var1, com.aspose.slides.internal.x8w.l6 var2) {
      if (var2.n5() == 0) {
         return null;
      }

      for (int var3 = 0; var3 < var2.n5(); var3++) {
         com.aspose.slides.internal.x8w.l6 var4 = var2.n5(var3);

         for (int var5 = 0; var5 < var4.n5(); var5++) {
            com.aspose.slides.internal.x8w.l6 var6 = var4.n5(var5);
            if (var6.n5() == 2) {
               com.aspose.slides.internal.x8w.l6 var7 = var6.n5(0);
               if (var7 != null && var7.l6(var1)) {
                  return var6;
               }
            }
         }
      }

      return null;
   }

   private String n5(com.aspose.slides.internal.x8w.l6 var1) {
      if (var1.n5() != 2) {
         return d1.n5;
      }

      com.aspose.slides.internal.x8w.l6 var2 = var1.n5(1);
      if (var2.u3() != null && var2.k5() != 0) {
         if (com.aspose.slides.internal.v6g.k5.u3(var2.l6(), 6) != 30) {
            return com.aspose.slides.internal.l7h.j5.z3().l6(var2.u3());
         }

         a5 var3 = new a5();

         for (int var4 = 1; var4 < var2.u3().length; var4 += 2) {
            var3.n5(com.aspose.slides.internal.v6g.k5.x8(var2.u3()[var4], 6));
         }

         return var3.toString();
      } else {
         return d1.n5;
      }
   }

   private void n5(byte[] var1, String var2) {
      com.aspose.slides.internal.i2i.s7 var3 = var2 == null ? new com.aspose.slides.internal.i2i.s7(var1) : new com.aspose.slides.internal.i2i.s7(var1, var2);
      if (var3.k5().size() > 0) {
         this.x8 = var3.k5().n5(0);
      } else {
         this.x8 = null;
      }

      if (var3.l6().size() > 0) {
         this.x8.n5(com.aspose.slides.internal.v6g.k5.n5(var3.l6().get_Item(0), z6.class));
         this.x8.n5(com.aspose.slides.internal.v6g.k5.n5(var3.l6().get_Item(0), com.aspose.slides.internal.o8m.z3.class));
      }
   }

   @Override
   public void n5(byte[] var1, String var2, int var3) {
      super.n5(var1, var2, var3);
      if (var2 == null) {
         try {
            this.x8 = new com.aspose.slides.internal.i2i.l6(var1);
         } catch (RuntimeException var9) {
            try {
               this.n5(var1, (String)null);
            } catch (RuntimeException var8) {
               String var6 = d1.n5("Unable to decode certificate.", new Object[]{});
               throw new CryptographicException(var6, var8);
            }
         }
      } else {
         try {
            this.n5(var1, var2);
         } catch (RuntimeException var7) {
            this.x8 = new com.aspose.slides.internal.i2i.l6(var1);
         }
      }
   }

   @Override
   public void n5(String var1, String var2, int var3) {
      byte[] var4 = n5(var1);
      this.n5(var4, var2, var3);
   }

   private static byte[] n5(String var0) {
      byte[] var1 = null;
      com.aspose.slides.internal.z0k.n3 var2 = com.aspose.slides.internal.z0k.u9.u3(var0);

      try {
         var1 = new byte[(int)var2.getLength()];
         var2.read((byte[])var1, 0, ((byte[])var1).length);
         var2.close();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return (byte[])var1;
   }

   @Override
   public void k5() {
      this.x8 = null;
      this.k5 = false;
      this.u3 = null;
      this.a6 = d1.n5;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = null;
      this.s7 = null;
      super.k5();
   }

   @Override
   public String toString() {
      return this.x8 == null ? "System.Security.Cryptography.X509Certificates.X509Certificate2" : super.n5(true);
   }

   @Override
   public String n5(boolean var1) {
      if (this.x8 == null) {
         return "System.Security.Cryptography.X509Certificates.X509Certificate2";
      }

      if (!var1) {
         return super.n5(true);
      }

      String var2 = p8.k5();
      a5 var3 = new a5();
      var3.n5("[Version]{0}  V{1}{0}{0}",new Object[]{ var2, com.aspose.slides.internal.v6g.k5.l6(this.j5())});
      var3.n5("[Subject]{0}  {1}{0}{0}",new Object[]{ var2, this.l6()});
      var3.n5("[Issuer]{0}  {1}{0}{0}",new Object[]{ var2, this.n5()});
      var3.n5("[Serial Number]{0}  {1}{0}{0}",new Object[]{ var2, this.n3()});
      var3.n5("[Not Before]{0}  {1}{0}{0}",new Object[]{ var2, com.aspose.slides.internal.v6g.k5.n5(this.z1())});
      var3.n5("[Not After]{0}  {1}{0}{0}",new Object[]{ var2, com.aspose.slides.internal.v6g.k5.n5(this.t9())});
      var3.n5("[Thumbprint]{0}  {1}{0}{0}",new Object[]{ var2, this.z8()});
      var3.n5("[Signature Algorithm]{0}  {1}({2}){0}{0}",new Object[]{ var2, this.k7().n5(), this.k7().l6()});
      com.aspose.slides.internal.o8m.a6 var4 = this.q0().k5();
      var3.n5("[Public Key]{0}  Algorithm: ",new Object[]{ var2});
      if (com.aspose.slides.internal.v6g.k5.l6(var4, z6.class)) {
         var3.n5("RSA");
      } else if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.o8m.z3.class)) {
         var3.n5("DSA");
      } else {
         var3.n5(var4.toString());
      }

      var3.n5("{0}  Length: {1}{0}  Key Blob: ",new Object[]{ var2, com.aspose.slides.internal.v6g.k5.l6(var4.n5())});
      n5(var3, this.q0().n5().l6());
      var3.n5("{0}  Parameters: ",new Object[]{ var2});
      n5(var3, this.q0().l6().l6());
      var3.n5(var2);
      return var3.toString();
   }

   private static void n5(a5 var0, byte[] var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            var0.n5(com.aspose.slides.ms.System.e2.n5(var1[var2], "x2"));
            if (var2 < var1.length - 1) {
               var0.n5(" ");
            }
         }
      }
   }

   public boolean w1() {
      if (this.x8 == null) {
         throw new CryptographicException(n3);
      }

      x8 var1 = (x8)com.aspose.slides.internal.o8m.y4.n5(x8.class.getName());
      return var1.n5(this);
   }

   public com.aspose.slides.internal.i2i.l6 r4() {
      return this.x8;
   }
}
