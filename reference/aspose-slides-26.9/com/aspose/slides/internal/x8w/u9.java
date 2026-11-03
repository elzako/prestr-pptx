package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.o8m.e5;
import com.aspose.slides.internal.o8m.j4;
import com.aspose.slides.internal.o8m.z6;
import java.math.BigInteger;

public class u9 extends z6 {
   private boolean u3 = false;
   private boolean a6 = true;
   private boolean u9 = false;
   private boolean h0 = false;
   private BigInteger c8;
   private BigInteger t2;
   private BigInteger s7;
   private BigInteger x8;
   private BigInteger n3;
   private BigInteger y4;
   private BigInteger e2;
   private BigInteger t9;
   private u9$n5 z1;
   public final com.aspose.slides.internal.v6g.n5<u9$n5> k5 = new c4(this);

   public u9() {
      this(1024);
   }

   public u9(int var1) {
      this.l6 = new e5[1];
      this.l6[0] = new e5(384, 16384, 8);
      super.n5(var1);
   }

   private void u9() {
      int var1 = this.n5() + 1 >> 1;
      int var2 = this.n5() - var1;
      long var3 = 17L;
      this.t9 = com.aspose.slides.internal.x8w.s7.n5(var3);

      do {
         this.t2 = com.aspose.slides.internal.x8w.s7.l6(var1);
      } while (com.aspose.slides.internal.x8w.s7.l6(this.t2, var3) == 1);

      while (true) {
         this.s7 = com.aspose.slides.internal.x8w.s7.l6(var2);
         if (com.aspose.slides.internal.x8w.s7.l6(this.s7, var3) != 1 && !com.aspose.slides.internal.x8w.s7.s7(this.t2, this.s7)) {
            this.e2 = com.aspose.slides.internal.x8w.s7.k5(this.t2, this.s7);
            if (this.e2.bitLength() == this.n5()) {
               BigInteger var5 = com.aspose.slides.internal.x8w.s7.l6(this.t2, com.aspose.slides.internal.x8w.s7.n5(1L));
               BigInteger var6 = com.aspose.slides.internal.x8w.s7.l6(this.s7, com.aspose.slides.internal.x8w.s7.n5(1L));
               BigInteger var7 = com.aspose.slides.internal.x8w.s7.k5(var5, var6);
               this.c8 = this.t9.modInverse(var7);
               this.x8 = com.aspose.slides.internal.x8w.s7.a6(this.c8, var5);
               this.n3 = com.aspose.slides.internal.x8w.s7.a6(this.c8, var6);
               this.y4 = this.s7.modInverse(this.t2);
               this.u9 = true;
               this.u3 = true;
               if (this.k5 != null) {
                  this.z1.n5(this, null);
               }

               return;
            }

            if (com.aspose.slides.internal.x8w.s7.c8(this.t2, this.s7)) {
               this.t2 = this.s7;
            }
         }
      }
   }

   @Override
   public int n5() {
      if (this.u9) {
         int var1 = this.e2.bitLength();
         if ((var1 & 7) != 0) {
            var1 += 8 - (var1 & 7);
         }

         return var1;
      } else {
         return super.n5();
      }
   }

   public boolean u3() {
      return this.u9 && (this.c8 == null || this.e2 == null);
   }

   @Override
   public byte[] l6(byte[] var1) {
      if (this.h0) {
         throw new ObjectDisposedException("private key");
      }

      if (!this.u9) {
         this.u9();
      }

      BigInteger var2 = com.aspose.slides.internal.x8w.s7.n5(var1);
      BigInteger var3 = null;
      if (this.a6) {
         var3 = com.aspose.slides.internal.x8w.s7.n5(this.e2.bitLength());
         var2 = com.aspose.slides.internal.x8w.s7.a6(com.aspose.slides.internal.x8w.s7.k5(var3.modPow(this.t9, this.e2), var2), this.e2);
      }

      BigInteger var7;
      if (this.u3) {
         BigInteger var4 = var2.modPow(this.x8, this.t2);
         BigInteger var5 = var2.modPow(this.n3, this.s7);
         if (com.aspose.slides.internal.x8w.s7.u9(var5, var4)) {
            BigInteger var6 = com.aspose.slides.internal.x8w.s7.l6(
               this.t2,
               com.aspose.slides.internal.x8w.s7.a6(com.aspose.slides.internal.x8w.s7.k5(com.aspose.slides.internal.x8w.s7.l6(var5, var4), this.y4), this.t2)
            );
            var7 = com.aspose.slides.internal.x8w.s7.n5(var5, com.aspose.slides.internal.x8w.s7.k5(this.s7, var6));
         } else {
            BigInteger var11 = com.aspose.slides.internal.x8w.s7.a6(
               com.aspose.slides.internal.x8w.s7.k5(com.aspose.slides.internal.x8w.s7.l6(var4, var5), this.y4), this.t2
            );
            var7 = com.aspose.slides.internal.x8w.s7.n5(var5, com.aspose.slides.internal.x8w.s7.k5(this.s7, var11));
         }
      } else {
         if (this.u3()) {
            throw new CryptographicException(z3.n5("Missing private key to decrypt value."));
         }

         var7 = var2.modPow(this.c8, this.e2);
      }

      if (this.a6) {
         var7 = com.aspose.slides.internal.x8w.s7.a6(com.aspose.slides.internal.x8w.s7.k5(var7, var3.modInverse(this.e2)), this.e2);
         var3 = BigInteger.ZERO;
      }

      byte[] var10 = this.n5(var7, this.n5() >> 3);
      var2 = BigInteger.ZERO;
      var7 = BigInteger.ZERO;
      return var10;
   }

   @Override
   public byte[] n5(byte[] var1) {
      if (this.h0) {
         throw new ObjectDisposedException("public key");
      }

      if (!this.u9) {
         this.u9();
      }

      BigInteger var2 = com.aspose.slides.internal.x8w.s7.n5(var1);
      BigInteger var3 = var2.modPow(this.t9, this.e2);
      byte[] var4 = this.n5(var3, this.n5() >> 3);
      var2 = BigInteger.ZERO;
      var3 = BigInteger.ZERO;
      return var4;
   }

   @Override
   public j4 l6(boolean var1) {
      if (this.h0) {
         throw new ObjectDisposedException(z3.n5("Keypair was disposed"));
      }

      if (!this.u9) {
         this.u9();
      }

      j4 var2 = new j4();
      var2.c8 = com.aspose.slides.internal.x8w.s7.n5(this.t9);
      var2.h0 = com.aspose.slides.internal.x8w.s7.n5(this.e2);
      if (var1) {
         if (this.c8 == null) {
            throw new CryptographicException("Missing private key");
         }

         var2.k5 = com.aspose.slides.internal.x8w.s7.n5(this.c8);
         if (var2.k5.length != var2.h0.length) {
            byte[] var3 = new byte[var2.h0.length];
            com.aspose.slides.ms.System.y4.n5(var2.k5, 0, var3, var3.length - var2.k5.length, var2.k5.length);
            var2.k5 = var3;
         }

         if (this.t2 != null && this.s7 != null && this.x8 != null && this.n3 != null && this.y4 != null) {
            int var4 = this.n5() >> 4;
            var2.n5 = this.n5(this.t2, var4);
            var2.l6 = this.n5(this.s7, var4);
            var2.u3 = this.n5(this.x8, var4);
            var2.a6 = this.n5(this.n3, var4);
            var2.u9 = this.n5(this.y4, var4);
         }
      }

      return var2;
   }

   @Override
   public void n5(j4 var1) {
      if (this.h0) {
         throw new ObjectDisposedException(z3.n5("Keypair was disposed"));
      }

      if (var1.c8 == null) {
         throw new CryptographicException(z3.n5("Missing Exponent"));
      }

      if (var1.h0 == null) {
         throw new CryptographicException(z3.n5("Missing Modulus"));
      }

      this.t9 = com.aspose.slides.internal.x8w.s7.n5(var1.c8);
      this.e2 = com.aspose.slides.internal.x8w.s7.n5(var1.h0);
      if (var1.k5 != null) {
         this.c8 = com.aspose.slides.internal.x8w.s7.n5(var1.k5);
      }

      if (var1.u3 != null) {
         this.x8 = com.aspose.slides.internal.x8w.s7.n5(var1.u3);
      }

      if (var1.a6 != null) {
         this.n3 = com.aspose.slides.internal.x8w.s7.n5(var1.a6);
      }

      if (var1.u9 != null) {
         this.y4 = com.aspose.slides.internal.x8w.s7.n5(var1.u9);
      }

      if (var1.n5 != null) {
         this.t2 = com.aspose.slides.internal.x8w.s7.n5(var1.n5);
      }

      if (var1.l6 != null) {
         this.s7 = com.aspose.slides.internal.x8w.s7.n5(var1.l6);
      }

      this.u9 = true;
      boolean var2 = this.t2 != null && this.s7 != null && this.x8 != null;
      this.u3 = var2 && this.n3 != null && this.y4 != null;
      if (var2) {
         boolean var3 = com.aspose.slides.internal.x8w.s7.s7(this.e2, com.aspose.slides.internal.x8w.s7.k5(this.t2, this.s7));
         if (var3) {
            BigInteger var4 = com.aspose.slides.internal.x8w.s7.l6(this.t2, com.aspose.slides.internal.x8w.s7.n5(1L));
            BigInteger var5 = com.aspose.slides.internal.x8w.s7.l6(this.s7, com.aspose.slides.internal.x8w.s7.n5(1L));
            BigInteger var6 = com.aspose.slides.internal.x8w.s7.k5(var4, var5);
            BigInteger var7 = this.t9.modInverse(var6);
            var3 = com.aspose.slides.internal.x8w.s7.s7(this.c8, var7);
            if (!var3 && this.u3) {
               var3 = com.aspose.slides.internal.x8w.s7.s7(this.x8, com.aspose.slides.internal.x8w.s7.a6(var7, var4))
                  && com.aspose.slides.internal.x8w.s7.s7(this.n3, com.aspose.slides.internal.x8w.s7.a6(var7, var5))
                  && com.aspose.slides.internal.x8w.s7.s7(this.y4, this.s7.modInverse(this.t2));
            }
         }

         if (!var3) {
            throw new CryptographicException(z3.n5("Private/public key mismatch"));
         }
      }
   }

   @Override
   protected void n5(boolean var1) {
      if (!this.h0) {
         if (this.c8 != null) {
            this.c8 = BigInteger.ZERO;
            this.c8 = null;
         }

         if (this.t2 != null) {
            this.t2 = BigInteger.ZERO;
            this.t2 = null;
         }

         if (this.s7 != null) {
            this.s7 = BigInteger.ZERO;
            this.s7 = null;
         }

         if (this.x8 != null) {
            this.x8 = BigInteger.ZERO;
            this.x8 = null;
         }

         if (this.n3 != null) {
            this.n3 = BigInteger.ZERO;
            this.n3 = null;
         }

         if (this.y4 != null) {
            this.y4 = BigInteger.ZERO;
            this.y4 = null;
         }

         if (var1) {
            if (this.t9 != null) {
               this.t9 = BigInteger.ZERO;
               this.t9 = null;
            }

            if (this.e2 != null) {
               this.e2 = BigInteger.ZERO;
               this.e2 = null;
            }
         }
      }

      this.h0 = true;
   }

   @Override
   public String k5(boolean var1) {
      StringBuilder var2 = new StringBuilder();
      j4 var3 = this.l6(var1).n5();

      try {
         var2.append("<RSAKeyValue>");
         var2.append("<Modulus>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.h0));
         var2.append("</Modulus>");
         var2.append("<Exponent>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.c8));
         var2.append("</Exponent>");
         if (var1) {
            if (var3.n5 != null) {
               var2.append("<P>");
               var2.append(com.aspose.slides.ms.System.z3.n5(var3.n5));
               var2.append("</P>");
            }

            if (var3.l6 != null) {
               var2.append("<Q>");
               var2.append(com.aspose.slides.ms.System.z3.n5(var3.l6));
               var2.append("</Q>");
            }

            if (var3.u3 != null) {
               var2.append("<DP>");
               var2.append(com.aspose.slides.ms.System.z3.n5(var3.u3));
               var2.append("</DP>");
            }

            if (var3.a6 != null) {
               var2.append("<DQ>");
               var2.append(com.aspose.slides.ms.System.z3.n5(var3.a6));
               var2.append("</DQ>");
            }

            if (var3.u9 != null) {
               var2.append("<InverseQ>");
               var2.append(com.aspose.slides.ms.System.z3.n5(var3.u9));
               var2.append("</InverseQ>");
            }

            var2.append("<D>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.k5));
            var2.append("</D>");
         }

         var2.append("</RSAKeyValue>");
      } catch (Exception var5) {
         if (var3.n5 != null) {
            com.aspose.slides.ms.System.u3.n5(var3.n5, 0, var3.n5.length);
         }

         if (var3.l6 != null) {
            com.aspose.slides.ms.System.u3.n5(var3.l6, 0, var3.l6.length);
         }

         if (var3.u3 != null) {
            com.aspose.slides.ms.System.u3.n5(var3.u3, 0, var3.u3.length);
         }

         if (var3.a6 != null) {
            com.aspose.slides.ms.System.u3.n5(var3.a6, 0, var3.a6.length);
         }

         if (var3.u9 != null) {
            com.aspose.slides.ms.System.u3.n5(var3.u9, 0, var3.u9.length);
         }

         if (var3.k5 != null) {
            com.aspose.slides.ms.System.u3.n5(var3.k5, 0, var3.k5.length);
         }

         throw var5;
      }

      return var2.toString();
   }

   public boolean a6() {
      return !this.u9 || this.u3;
   }

   private byte[] n5(BigInteger var1, int var2) {
      byte[] var3 = com.aspose.slides.internal.x8w.s7.n5(var1);
      if (var3.length >= var2) {
         return var3;
      }

      byte[] var4 = new byte[var2];
      com.aspose.slides.ms.System.y4.n5(var3, 0, var4, var2 - var3.length, var3.length);
      com.aspose.slides.ms.System.u3.n5(var3, 0, var3.length);
      return var4;
   }

   // $VF: synthetic method
   static u9$n5 n5(u9 var0, u9$n5 var1) {
      return var0.z1 = var1;
   }
}
