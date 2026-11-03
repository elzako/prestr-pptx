package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XPathException;

public final class z6 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private k8 u9;
   private int h0 = 0;

   private void n5() {
      this.h0 = 0;
      this.a6 = false;
   }

   private j9 n5(y5 var1, int var2, int[] var3) {
      j9 var4 = null;
      if (var1.u3().length() > 0) {
         this.a6 = true;
      }

      this.u9 = null;
      j9 var8;
      if (var1.k5() != null) {
         byte var5 = 0;
         if ((var2 & 2) == 0) {
            y5 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.k5(), y5.class);
            if (var6 != null && var1.h0() == 3 && var6.h0() == 5 && var6.u9() == 9) {
               j9 var7;
               if (var6.k5() != null) {
                  var7 = this.n5(var6.k5(), 1, var3);
               } else {
                  var7 = new u4();
                  var3[0] = 0;
               }

               var4 = new z5(var7, var1.a6(), var1.u3(), var1.u9(), false, var6.c8());
               if ((var3[0] & 8) != 0) {
                  var4 = new h5(var4);
               }

               var3[0] |= 8;
               return var4;
            }

            if (var1.h0() == 4 || var1.h0() == 5) {
               var5 |= 1;
            }
         }

         var8 = this.n5(var1.k5(), var5, var3);
      } else {
         var8 = new u4();
         var3[0] = 0;
      }

      switch (var1.h0()) {
         case 0:
            var4 = new i9(var8, var1.a6(), var1.u3(), var1.u9(), false);
            var3[0] |= 8;
            break;
         case 1:
            var4 = new i9(var8, var1.a6(), var1.u3(), var1.u9(), true);
            var3[0] |= 8;
            break;
         case 2:
            var4 = new c3(var8, var1.a6(), var1.u3(), var1.u9());
            break;
         case 3:
            if ((var3[0] & 8) != 0) {
               var4 = new q1(var8, var1.a6(), var1.u3(), var1.u9());
            } else {
               var4 = new w8(var8, var1.a6(), var1.u3(), var1.u9());
            }
            break;
         case 4:
            if ((var2 & 1) != 0) {
               var4 = new p7(var8, false, var1.a6(), var1.u3(), var1.u9(), false);
            } else {
               var4 = new z5(var8, var1.a6(), var1.u3(), var1.u9(), false, false);
               if ((var3[0] & 8) != 0) {
                  var4 = new h5(var4);
               }
            }

            var3[0] |= 8;
            break;
         case 5:
            if ((var2 & 1) != 0) {
               var4 = new p7(var8, true, var1.a6(), var1.u3(), var1.u9(), var1.c8());
            } else {
               var4 = new z5(var8, var1.a6(), var1.u3(), var1.u9(), true, var1.c8());
               if ((var3[0] & 8) != 0) {
                  var4 = new h5(var4);
               }
            }

            var3[0] |= 8;
            break;
         case 6:
            var4 = new i4(var8, var1.a6(), var1.u3(), var1.u9());
            var3[0] |= 8;
            break;
         case 7:
            var4 = new w3(var8, var1.a6(), var1.u3(), var1.u9());
            if ((var3[0] & 8) != 0) {
               var4 = new h5(var4);
            }
            break;
         case 8:
            if ((var1.u9() == 9 || var1.u9() == 1 || var1.u9() == 2) && var1.u3().length() == 0) {
               var4 = new u6(var8, var1.a6(), var1.u3(), var1.u9());
            } else {
               var4 = new a8();
            }
            break;
         case 9:
            var4 = new p3(var8, var1.a6(), var1.u3(), var1.u9());
            break;
         case 10:
            var4 = new y0(var8, var1.a6(), var1.u3(), var1.u9());
            var3[0] |= 8;
            break;
         case 11:
            var4 = new x9(var8, var1.a6(), var1.u3(), var1.u9());
            break;
         case 12:
            var4 = new a7(var8, var1.a6(), var1.u3(), var1.u9());
            break;
         default:
            throw XPathException.create("The XPath query '{0}' is not supported.", this.n5);
      }

      return var4;
   }

   private boolean n5(j9 var1) {
      return var1.u9() == 5 || var1.u9() == 0;
   }

   private j9 n5(y9 var1, int var2, int[] var3) {
      boolean var4 = (var2 & 4) == 0;
      int var5 = 0;
      int[] var6 = new int[]{0};
      j9 var7 = this.n5(var1.u3(), 0, var6);
      var5 = var6[0];
      if (this.n5(var7) || (var5 & 6) != 0) {
         var5 |= 2;
         var2 |= 2;
      }

      var2 &= -2;
      j9 var8 = this.n5(var1.k5(), var2 | 4, var3);
      if (var1.k5().ad_() != 2) {
         var3[0] &= -2;
      }

      if ((var5 & 2) != 0) {
         var3[0] |= 1;
      }

      a1 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, a1.class);
      if (var9 != null && (var5 & 2) == 0 && var9.z1().u9() != 5) {
         j9 var10 = var9.z1();
         if (var10.u9() == 0) {
            var10 = new t2(3, new t1(1, null), var10);
         }

         var7 = new b5(2, var10, var7);
         var8 = var9.n5;
      }

      if ((var3[0] & 1) != 0 && com.aspose.slides.internal.v6g.k5.l6(var8, h5.class)) {
         var8 = ((h5)var8).n5;
      }

      if (this.u9 == null) {
         this.u9 = com.aspose.slides.internal.v6g.k5.n5(var8, k8.class);
      }

      boolean var15 = (var8.c8() & 16) != 0;
      boolean var16 = (var8.c8() & 8) != 0;
      if ((var5 & 2) != 0) {
         if (var16) {
            var8 = new o5(var8);
         } else if ((var5 & 4) != 0) {
            var8 = new l6(var8);
         }
      }

      if (var4 && this.u9 != null) {
         if (var15 && (var3[0] & 1) != 0) {
            a1 var14 = new a1(var8, var7, false);
            j9 var11 = this.u9.n5;
            if (!com.aspose.slides.internal.v6g.k5.l6(var11, u4.class)) {
               this.u9.n5 = new u4();
               this.u9 = null;
               return new v4(var11, var14);
            }

            this.u9 = null;
            return var14;
         }

         this.u9 = null;
      }

      return new a1(var8, var7, (var5 & 2) == 0);
   }

   private j9 n5(a3 var1, int[] var2) {
      int var3 = 0;
      int var4 = 0;
      int[] var5 = new int[]{0};
      j9 var6 = this.n5(var1.u3(), 0, var5);
      var3 = var5[0];
      int[] var7 = new int[]{0};
      j9 var8 = this.n5(var1.a6(), 0, var7);
      var4 = var7[0];
      var2[0] = var3 | var4;
      switch (var1.k5()) {
         case 1:
         case 2:
            return new b5(var1.k5(), var6, var8);
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            return new t2(var1.k5(), var6, var8);
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
            return new h2(var1.k5(), var6, var8);
         case 14:
            var2[0] |= 8;
            return new v8(var6, var8);
         default:
            return null;
      }
   }

   private j9 n5(g7 var1) {
      this.a6 = true;
      if (!this.l6) {
         throw XPathException.create("'{0}' is an invalid key pattern. It either contains a variable reference or 'key()' function.", this.n5);
      } else {
         return new j4(var1.k5(), var1.u3());
      }
   }

   private j9 n5(k5 var1, int[] var2) {
      var2[0] = 0;
      j9 var3 = null;
      switch (var1.k5()) {
         case 0:
            var3 = new t1(var1.k5(), null);
            var2[0] |= 4;
            return var3;
         case 1:
            var3 = new t1(var1.k5(), null);
            var2[0] |= 2;
            return var3;
         case 2:
            return new t1(2, this.n5((c4)var1.u3().get_Item(0), 0, var2));
         case 3:
            var3 = new h0(this.n5((c4)var1.u3().get_Item(0), 0, var2));
            var2[0] |= 8;
            return var3;
         case 4:
         case 5:
         case 6:
            if (var1.u3() != null && var1.u3().size() > 0) {
               return new t1(var1.k5(), this.n5((c4)var1.u3().get_Item(0), 0, var2));
            }

            return new t1(var1.k5(), null);
         case 7:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
            return new s0(var1.k5(), com.aspose.slides.ms.System.u3.n5(this.n5(var1.u3(), var2)));
         case 8:
         case 12:
         case 22:
            return new u8(var1.k5(), this.n5((c4)var1.u3().get_Item(0), 0, var2));
         case 9:
         case 23:
         case 24:
         case 25:
         case 26:
            if (var1.u3() != null && var1.u3().size() > 0) {
               return new a5(var1.k5(), this.n5((c4)var1.u3().get_Item(0), 0, var2));
            }

            return new a5(9, null);
         case 10:
         case 11:
            return new u8(var1.k5(), null);
         case 27:
            this.a6 = true;
            if (!this.u3 && "current".equals(var1.u9()) && var1.a6().length() == 0) {
               throw XPathException.create("The 'current()' function cannot be used in a pattern.");
            } else {
               if (!this.k5 && "key".equals(var1.u9()) && var1.a6().length() == 0) {
                  throw XPathException.create("'{0}' is an invalid key pattern. It either contains a variable reference or 'key()' function.", this.n5);
               }

               var3 = new u3(var1.a6(), var1.u9(), this.n5(var1.u3(), var2));
               var2[0] |= 8;
               return var3;
            }
         default:
            throw XPathException.create("The XPath query '{0}' is not supported.", this.n5);
      }
   }

   private j9[] n5(ArrayList var1, int[] var2) {
      int var3 = var1 != null ? var1.size() : 0;
      j9[] var4 = new j9[var3];
      var2[0] = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = 0;
         int[] var7 = new int[]{0};
         var4[var5] = this.n5((c4)var1.get_Item(var5), 0, var7);
         var6 = var7[0];
         var2[0] |= var6;
      }

      return var4;
   }

   private j9 n5(c4 var1, int var2, int[] var3) {
      if (++this.h0 > 1024) {
         throw XPathException.create("The XPath query is too complex.");
      }

      j9 var4 = null;
      var3[0] = 0;
      switch (var1.ad_()) {
         case 0:
            var4 = this.n5((y5)var1, var2, var3);
            break;
         case 1:
            var4 = this.n5((a3)var1, var3);
            break;
         case 2:
            var4 = this.n5((y9)var1, var2, var3);
            break;
         case 3:
            var4 = new f0(((v0)var1).k5());
            break;
         case 4:
            var4 = this.n5((k5)var1, var3);
            break;
         case 5:
            var4 = new u9(this.n5(((a6)var1).k5(), 0, var3));
            break;
         case 6:
            var4 = new n5();
            break;
         case 7:
            var4 = this.n5((g7)var1);
      }

      this.h0--;
      return var4;
   }

   private j9 n5(c4 var1, String var2) {
      this.n5();
      int var3 = 0;
      this.n5 = var2;
      int[] var4 = new int[]{0};
      j9 var5 = this.n5(var1, 0, var4);
      var3 = var4[0];
      return var5;
   }

   public final j9 n5(String var1, boolean var2, boolean var3) {
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = true;
      return this.n5(y8.n5(var1), var1);
   }

   public final j9 n5(String var1, boolean[] var2) {
      j9 var3 = this.n5(var1, true, true);
      var2[0] = this.a6;
      return var3;
   }

   public final j9 l6(String var1, boolean var2, boolean var3) {
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = false;
      return this.n5(y8.l6(var1), var1);
   }
}
