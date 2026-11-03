package com.aspose.slides.internal.n9q;

import com.aspose.slides.internal.n1g.a6;
import com.aspose.slides.internal.n1g.k5;
import com.aspose.slides.internal.n1g.u9;
import com.aspose.slides.internal.p7x.l6;
import com.aspose.slides.internal.q8g.s7;
import com.aspose.slides.internal.q8g.t4;
import com.aspose.slides.internal.q8g.t9;
import com.aspose.slides.internal.r7n.c4;
import com.aspose.slides.internal.r7n.c8;
import com.aspose.slides.internal.r7n.e2;
import com.aspose.slides.internal.r7n.h0;
import com.aspose.slides.internal.r7n.j5;
import com.aspose.slides.internal.r7n.k7;
import com.aspose.slides.internal.r7n.m1;
import com.aspose.slides.internal.r7n.m3;
import com.aspose.slides.internal.r7n.n3;
import com.aspose.slides.internal.r7n.q0;
import com.aspose.slides.internal.r7n.r4;
import com.aspose.slides.internal.r7n.t2;
import com.aspose.slides.internal.r7n.w1;
import com.aspose.slides.internal.r7n.y4;
import com.aspose.slides.internal.r7n.z1;
import com.aspose.slides.internal.r7n.z3;
import com.aspose.slides.internal.r7n.z8;
import com.aspose.slides.internal.s2b.u3;
import com.aspose.slides.internal.x4a.x8;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.ArrayList;

public final class n5 {
   private InputStream u9;
   private int h0;
   private ArrayList c8 = new ArrayList();
   private byte[] t2 = new byte[6];
   byte[] n5 = null;
   long l6 = 0L;
   u9 k5;
   k5 u3;
   a6 a6;

   public n5() {
      this.u9 = null;
   }

   public void n5(InputStream var1) throws l6 {
      if (var1 == null) {
         throw new InvalidParameterException("Stream cannot be null.");
      }

      this.u9 = var1;
      this.h0 = 0;
      this.u3();
   }

   private void u3() throws l6 {
      try {
         byte[] var1 = new byte[0];
         int var2 = 0;

         while (true) {
            try {
               var1 = this.n5(var1, var2, 4);
               var2 = 0;
               short var3 = com.aspose.slides.internal.l1b.k5.l6(var1, 0);
               short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, 2);
               if (var3 == -12841 && var4 == -25914) {
                  var1 = this.n5(var1, var2, 22);
                  var2 = 0;
                  u9 var11 = new u9();
                  var2 += var11.n5(var1, var2);
                  if (var11.n5.getWidth() != 0.0 && var11.n5.getHeight() != 0.0) {
                     this.k5 = var11;
                  } else {
                     Object var12 = null;
                  }
               } else {
                  if (var3 >= 0 && var3 <= 1 && var4 == 9 || var3 <= 0 || var3 > 8) {
                     break;
                  }

                  k5 var5;
                  if (var4 == 0) {
                     var1 = this.n5(var1, var2, 16);
                     var5 = new com.aspose.slides.internal.n1g.l6();
                  } else {
                     var1 = this.n5(var1, var2, 8);
                     var5 = new com.aspose.slides.internal.n1g.n5();
                  }

                  var2 = 0;
                  var2 += var5.n5(var1, var2);
                  this.u3 = var5;
               }
            } catch (l6 var6) {
               break;
            }
         }

         a6 var10 = new a6();
         var1 = this.n5(var1, var2, 18);
         var2 += var10.n5(var1, 0);
         this.a6 = var10;
         this.l6 = this.a6.k5() - this.a6.n5();
         this.l6 *= 2L;
      } catch (IOException var7) {
         throw new l6("IOException occured during metafile reading", var7);
      }
   }

   private byte[] n5(byte[] var1, int var2, int var3) throws IOException {
      if (var1.length - var2 < var3) {
         byte[] var6 = new byte[var3];
         int var7 = var1.length - var2;
         if (var7 < 0) {
            this.u9.skip(-var7);
         }

         var7 = 0;

         while (var2 < var1.length) {
            var6[var7++] = var1[var2++];
         }

         this.l6(var6, var7, var3 - var7);
         return var6;
      } else {
         byte[] var4 = new byte[var1.length - var2];
         int var5 = 0;

         while (var2 < var1.length) {
            var4[var5++] = var1[var2++];
         }

         this.l6(var4, var5, var3 - var5);
         return var4;
      }
   }

   private void l6(byte[] var1, int var2, int var3) throws IOException {
      int var4 = var2 + var3;
      if (var2 < var3) {
         while (var2 < var4) {
            int var5 = this.u9.read(var1, var2, var4 - var2);
            if (var5 < 0) {
               throw new IOException("Unexpected end of file.");
            }

            var2 += var5;
         }
      }
   }

   public synchronized u3 n5() throws l6 {
      if (!this.c8.isEmpty()) {
         u3 var11 = (u3)this.c8.get(0);
         this.c8.remove(0);
         return var11;
      }

      u3 var1 = null;
      if (this.l6 <= 3L) {
         return null;
      }

      try {
         if (this.l6 < 6L) {
            return null;
         }

         int var2 = 0;

         int var3;
         do {
            var3 = this.u9.read(this.t2, var2, this.t2.length - var2);
            if (var3 > 0) {
               var2 += var3;
            }
         } while (var3 > 0);

         this.l6 -= 6L;
         if (var2 < 4) {
            return null;
         }

         if (var2 != 6) {
            throw new l6("Unexpected end of file.");
         }

         int var4 = com.aspose.slides.internal.l1b.k5.u3(this.t2, 0);
         if (var4 == 0) {
            return null;
         }

         short var5 = com.aspose.slides.internal.l1b.k5.l6(this.t2, 4);
         var4 = var4 * 2 - 6;
         if (var4 < 0) {
            throw new l6("File broken.");
         }

         byte[] var6 = new byte[var4];
         this.l6(var6, 0, var4);
         this.l6 -= var4;
         switch (var5) {
            case 0:
               var1 = new com.aspose.slides.internal.n1g.u3();
               break;
            case 30:
               var1 = new t2();
               break;
            case 53:
               var1 = new h0();
               break;
            case 247:
               var1 = new com.aspose.slides.internal.x4a.k5();
               break;
            case 258:
               var1 = new e2();
               break;
            case 259:
               var1 = new z1();
               break;
            case 260:
               var1 = new z3();
               break;
            case 262:
               var1 = new q0();
               break;
            case 263:
               var1 = new m1();
               break;
            case 264:
               var1 = new m3();
               break;
            case 295:
               var1 = new c8();
               break;
            case 298:
               var1 = new com.aspose.slides.internal.q8g.c8();
               break;
            case 299:
               var1 = new s7();
               break;
            case 300:
               var1 = new com.aspose.slides.internal.x4a.s7();
               break;
            case 301:
               var1 = new x8();
               break;
            case 302:
               var1 = new k7();
               break;
            case 322:
               var1 = new com.aspose.slides.internal.x4a.c8();
               break;
            case 496:
               var1 = new com.aspose.slides.internal.x4a.t2();
               break;
            case 505:
               var1 = new com.aspose.slides.internal.x4a.a6();
               break;
            case 513:
               var1 = new y4();
               break;
            case 521:
               var1 = new z8();
               break;
            case 523:
               var1 = new c4();
               break;
            case 524:
               var1 = new r4();
               break;
            case 525:
               var1 = new w1();
               break;
            case 526:
               var1 = new j5();
               break;
            case 527:
               var1 = new com.aspose.slides.internal.r7n.u9();
               break;
            case 529:
               var1 = new com.aspose.slides.internal.r7n.a6();
               break;
            case 531:
               var1 = new com.aspose.slides.internal.q8g.t2();
               break;
            case 532:
               var1 = new com.aspose.slides.internal.r7n.k5();
               break;
            case 544:
               var1 = new com.aspose.slides.internal.r7n.u3();
               break;
            case 552:
               var1 = new com.aspose.slides.internal.q8g.u9();
               break;
            case 762:
               var1 = new com.aspose.slides.internal.x4a.u9();
               break;
            case 763:
               var1 = new com.aspose.slides.internal.x4a.l6();
               break;
            case 764:
               var1 = new com.aspose.slides.internal.x4a.n5();
               break;
            case 804:
               var1 = new t9();
               break;
            case 805:
               var1 = new com.aspose.slides.internal.q8g.z1();
               break;
            case 1040:
               var1 = new n3();
               break;
            case 1042:
               var1 = new com.aspose.slides.internal.r7n.x8();
               break;
            case 1045:
               var1 = new com.aspose.slides.internal.r7n.n5();
               break;
            case 1046:
               var1 = new com.aspose.slides.internal.r7n.l6();
               break;
            case 1048:
               var1 = new com.aspose.slides.internal.q8g.u3();
               break;
            case 1051:
               var1 = new t4();
               break;
            case 1065:
               var1 = new com.aspose.slides.internal.q8g.h0();
               break;
            case 1313:
               var1 = new com.aspose.slides.internal.q8g.z3();
               break;
            case 1336:
               var1 = new com.aspose.slides.internal.q8g.e2();
               break;
            case 1564:
               var1 = new com.aspose.slides.internal.q8g.q0();
               break;
            case 1565:
               var1 = new com.aspose.slides.internal.q8g.x8();
               break;
            case 1574:
               var1 = new com.aspose.slides.internal.e6a.n5();
               break;
            case 1791:
               var1 = new com.aspose.slides.internal.x4a.h0();
               break;
            case 2071:
               var1 = new com.aspose.slides.internal.q8g.l6();
               break;
            case 2074:
               var1 = new com.aspose.slides.internal.q8g.n3();
               break;
            case 2096:
               var1 = new com.aspose.slides.internal.q8g.k5();
               break;
            case 2338:
               var1 = new com.aspose.slides.internal.o5k.n5();
               break;
            case 2368:
               var1 = new com.aspose.slides.internal.o5k.l6();
               break;
            case 2610:
               var1 = new com.aspose.slides.internal.q8g.a6();
               break;
            case 2851:
               var1 = new com.aspose.slides.internal.o5k.u3();
               break;
            case 2881:
               var1 = new com.aspose.slides.internal.o5k.k5();
               break;
            case 3907:
               var1 = new com.aspose.slides.internal.o5k.a6();
               break;
            default:
               var1 = new com.aspose.slides.internal.g2x.n5(var5);
         }

         var1.n5(var6, 0, var6.length);
         this.h0++;
         return var1;
      } catch (IOException var7) {
         throw new l6("Error reading Wmf record number " + this.h0, var7);
      } catch (l6 var8) {
         throw new l6("Error reading Wmf record number " + this.h0, var8);
      } catch (IndexOutOfBoundsException var9) {
         throw new l6("Error reading Wmf record number " + this.h0, var9);
      }
   }

   public u9 l6() {
      return this.k5;
   }

   public a6 k5() {
      return this.a6;
   }
}
