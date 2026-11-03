package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.s4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public class u9 {
   private String n5;
   private String l6;
   private com.aspose.slides.internal.i2i.l6 k5;
   private boolean u3;
   private byte[] a6;

   public u9() {
   }

   public String n5() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      }

      if (this.n5 == null) {
         this.n5 = com.aspose.slides.internal.i2i.n3.n5(this.k5.z3(), true, ", ", true);
      }

      return this.n5;
   }

   public String l6() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      }

      if (this.l6 == null) {
         this.l6 = com.aspose.slides.internal.i2i.n3.n5(this.k5.m1(), true, ", ", true);
      }

      return this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      u9 var2 = obj instanceof u9 ? (u9)obj : null;
      return var2 != null && this.n5(var2);
   }

   public void n5(byte[] var1, String var2, int var3) {
      this.k5();
      if (var2 == null) {
         try {
            this.k5 = new com.aspose.slides.internal.i2i.l6(var1);
         } catch (Exception var12) {
            try {
               com.aspose.slides.internal.i2i.l6[] var5 = com.aspose.slides.internal.i2i.n5.n5(var1);
               this.k5 = var5.length > 0 ? var5[0] : null;
            } catch (Exception var11) {
               try {
                  com.aspose.slides.internal.i2i.s7 var6 = new com.aspose.slides.internal.i2i.s7(var1);
                  if (var6.k5().size() > 0) {
                     this.k5 = var6.k5().n5(0);
                  } else {
                     this.k5 = null;
                  }
               } catch (Exception var10) {
                  String var7 = d1.n5("Unable to decode certificate.", new Object[]{});
                  throw new CryptographicException(var7, var10);
               }
            }
         }
      } else {
         try {
            com.aspose.slides.internal.i2i.s7 var4 = new com.aspose.slides.internal.i2i.s7(var1, var2);
            if (var4.k5().size() > 0) {
               this.k5 = var4.k5().n5(0);
            } else {
               this.k5 = null;
            }
         } catch (com.aspose.slides.internal.i2i.t2 var8) {
            throw new CryptographicException(var8.getMessage(), var8);
         } catch (Exception var9) {
            this.k5 = new com.aspose.slides.internal.i2i.l6(var1);
         }
      }
   }

   public void n5(String var1, String var2, int var3) {
      byte[] var4 = n5(var1);
      this.n5(var4, var2, var3);
   }

   public void k5() {
      this.k5 = null;
      this.n5 = null;
      this.l6 = null;
      this.u3 = false;
      this.a6 = null;
   }

   private String n5(byte[] var1) {
      if (var1 == null) {
         return null;
      }

      a5 var2 = new a5();

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2.n5(com.aspose.slides.ms.System.e2.n5(var1[var3], "X2"));
      }

      return var2.toString();
   }

   u9(byte[] var1, boolean var2) {
      if (var1 != null) {
         this.n5(var1, (String)null, 0);
         this.u3 = !var2;
      }
   }

   public u9(byte[] var1) {
      this(var1, true);
   }

   public u9(u9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("cert");
      }

      if (var1 != null) {
         byte[] var2 = var1.x8();
         if (var2 != null) {
            this.k5 = new com.aspose.slides.internal.i2i.l6(var2);
         }

         this.u3 = false;
      }
   }

   public boolean n5(u9 var1) {
      if (var1 == null) {
         return false;
      }

      if (var1.k5 == null) {
         if (this.k5 == null) {
            return true;
         } else {
            throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
         }
      } else {
         byte[] var2 = var1.k5.t2();
         if (var2 != null) {
            if (this.k5 == null) {
               return false;
            }

            if (this.k5.t2() == null) {
               return false;
            }

            if (var2.length == this.k5.t2().length) {
               for (int var3 = 0; var3 < var2.length; var3++) {
                  if (var2[var3] != this.k5.t2()[var3]) {
                     return false;
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return this.k5 == null || this.k5.t2() == null;
         }
      }
   }

   public byte[] u3() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      }

      if (this.a6 == null && this.k5 != null) {
         s4 var1 = s4.a6();
         this.a6 = var1.l6(this.k5.t2());
      }

      return this.a6;
   }

   public String a6() {
      return this.n5(this.u3());
   }

   public String u9() {
      if (this.u3) {
         return null;
      } else if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      } else {
         return this.k5.e2().q0().toString();
      }
   }

   public String h0() {
      if (this.u3) {
         return null;
      } else if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      } else {
         return this.k5.t9().q0().toString();
      }
   }

   @Override
   public int hashCode() {
      if (this.k5 == null) {
         return 0;
      }

      if (this.a6 == null) {
         this.u3();
      }

      return this.a6 != null && this.a6.length >= 4 ? (this.a6[0] & 0xFF) << 24 | (this.a6[1] & 0xFF) << 16 | (this.a6[2] & 0xFF) << 8 | this.a6[3] & 0xFF : 0;
   }

   @Deprecated
   public String c8() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      } else {
         return this.k5.u3();
      }
   }

   @Deprecated
   public String t2() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      } else {
         return this.k5.y4();
      }
   }

   public byte[] s7() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      } else {
         return this.k5.h0();
      }
   }

   public byte[] x8() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      } else {
         return this.k5.t2();
      }
   }

   public byte[] n3() {
      if (this.k5 == null) {
         throw new CryptographicException(d1.n5("Certificate instance is empty.", new Object[]{}));
      } else {
         return this.k5.s7();
      }
   }

   @Override
   public String toString() {
      return super.toString();
   }

   public String n5(boolean var1) {
      if (var1 && this.k5 != null) {
         String var2 = p8.n5;
         a5 var3 = new a5();
         var3.n5("[Subject]{0}  {1}{0}{0}", var2, this.l6());
         var3.n5("[Issuer]{0}  {1}{0}{0}", var2, this.n5());
         var3.n5("[Not Before]{0}  {1}{0}{0}", var2, this.u9());
         var3.n5("[Not After]{0}  {1}{0}{0}", var2, this.h0());
         var3.n5("[Thumbprint]{0}  {1}{0}", var2, this.a6());
         var3.n5(var2);
         return var3.toString();
      } else {
         return this.getClass().getName();
      }
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
}
