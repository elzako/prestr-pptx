package com.aspose.slides.internal.u1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.g7.i2;
import com.aspose.slides.internal.g7.l0;
import com.aspose.slides.internal.g7.m3;
import com.aspose.slides.internal.g7.n2;
import com.aspose.slides.internal.g7.n3c;
import com.aspose.slides.internal.g7.u0a;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public abstract class u3 implements com.aspose.slides.internal.v2.e2 {
   private float a6;
   private a6 u9;
   private com.aspose.slides.internal.e6.n5<Float> h0;
   private boolean c8;
   private com.aspose.slides.internal.v2.s7 t2;
   private com.aspose.slides.internal.p2.l6 s7;
   private String x8;
   private Dictionary<Integer, int[]> n3 = new Dictionary<>();
   private final com.aspose.slides.internal.g4.a6 y4 = new com.aspose.slides.internal.g4.a6();
   private final com.aspose.slides.internal.g4.a6 e2 = new com.aspose.slides.internal.g4.a6();
   private com.aspose.slides.internal.g4.a6 t9;
   private static final int[] z1 = new int[]{
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      32,
      33,
      34,
      35,
      36,
      37,
      38,
      8217,
      40,
      41,
      42,
      43,
      44,
      45,
      46,
      47,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      58,
      59,
      60,
      61,
      62,
      63,
      64,
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      91,
      92,
      93,
      94,
      95,
      8216,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      123,
      124,
      125,
      126,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      161,
      162,
      163,
      8260,
      165,
      402,
      167,
      164,
      39,
      8220,
      171,
      8249,
      8250,
      64257,
      64258,
      0,
      8211,
      8224,
      8225,
      183,
      0,
      182,
      8226,
      8218,
      8222,
      8221,
      187,
      8230,
      8240,
      0,
      191,
      0,
      96,
      180,
      710,
      732,
      175,
      728,
      729,
      168,
      0,
      730,
      184,
      0,
      733,
      731,
      711,
      8212,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      198,
      0,
      170,
      0,
      0,
      0,
      0,
      321,
      216,
      338,
      186,
      0,
      0,
      0,
      0,
      0,
      230,
      0,
      0,
      0,
      305,
      0,
      0,
      322,
      248,
      339,
      223,
      0,
      0,
      0,
      0
   };
   protected final com.aspose.slides.internal.v2.k5 n5;
   protected static final m1 l6 = new m1(0.001F, 0.0F, 0.0F, 0.001F, 0.0F, 0.0F);
   protected String k5;
   protected boolean u3;

   public final com.aspose.slides.internal.v2.s7 k5() {
      if (this.t2 == null) {
         this.t2 = this.n5.u9(com.aspose.slides.internal.v2.c8.e0);
      }

      return this.t2;
   }

   public final void n5(com.aspose.slides.internal.v2.s7 var1) {
      this.n5.l6(com.aspose.slides.internal.v2.c8.e0, var1);
      this.t2 = var1;
   }

   public final com.aspose.slides.internal.p2.l6 u3() {
      return this.s7;
   }

   public final void n5(com.aspose.slides.internal.p2.l6 var1) {
      this.s7 = var1;
   }

   public final String a6() {
      return this.x8;
   }

   public final int u9() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.b1, -1);
   }

   public final int h0() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.r2, -1);
   }

   public final com.aspose.slides.internal.g4.a6 c8() {
      return this.y4;
   }

   public final com.aspose.slides.internal.g4.a6 s7() {
      return this.e2;
   }

   public final com.aspose.slides.internal.g4.a6 x8() {
      return this.t9;
   }

   public final com.aspose.slides.internal.e6.n5<Float> n3() {
      if (this.h0 == null && !this.c8) {
         com.aspose.slides.internal.v2.n5 var1 = this.n5.c8(com.aspose.slides.internal.v2.c8.e4w);
         if (var1 != null) {
            this.h0 = com.aspose.slides.internal.e6.n5.n5(var1);
         } else {
            this.c8 = true;
         }
      }

      return this.h0;
   }

   public u3() {
      this.n5 = new com.aspose.slides.internal.v2.k5();
      this.n5.n5(com.aspose.slides.internal.v2.c8.g2x, (com.aspose.slides.internal.v2.s7)com.aspose.slides.internal.v2.c8.c7);
      this.n5();
   }

   public u3(com.aspose.slides.internal.v2.k5 var1) {
      this.n5 = var1;
      this.u9 = this.k7();
      this.n5();
   }

   private void n5() {
      this.k5 = d1.n5;
      com.aspose.slides.internal.v2.c8 var1 = this.n5.a6(com.aspose.slides.internal.v2.c8.y2);
      if (var1 != null) {
         String var2 = var1.toString();
         this.x8 = com.aspose.slides.internal.v2.c8.k5(var2);
      } else {
         this.x8 = "Unspecified Font Name";
      }

      com.aspose.slides.internal.v2.c8 var4 = this.n5.a6(com.aspose.slides.internal.v2.c8.u7f);
      if (!com.aspose.slides.internal.v2.c8.o5k.equals(var4)
         && !com.aspose.slides.internal.v2.c8.o6t.equals(var4)
         && !com.aspose.slides.internal.v2.c8.n1g.equals(var4)) {
         com.aspose.slides.internal.v2.c8 var3 = this.n5.a6(com.aspose.slides.internal.v2.c8.e0);
         if (var3 != null && com.aspose.slides.internal.v2.c8.s2b.equals(var4)) {
            this.u3 = true;
            this.n5(this.n5);
         }
      }
   }

   public final com.aspose.slides.internal.x2.k5 y4() {
      com.aspose.slides.internal.x2.k5 var1 = null;
      com.aspose.slides.internal.v2.s7 var2 = this.z3();
      if (var2 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.x8.class)) {
         try {
            com.aspose.slides.internal.v2.x8 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.v2.x8.class);
            com.aspose.slides.internal.e7.s7 var4 = new com.aspose.slides.internal.e7.s7(var3);
            byte[] var5 = var4.n5();
            com.aspose.slides.internal.x2.u3 var6 = new com.aspose.slides.internal.x2.u3(var5);
            var1 = new com.aspose.slides.internal.x2.k5();
            com.aspose.slides.internal.x2.l6.n5(var1, var6);
         } catch (RuntimeException var7) {
            var1 = null;
         }
      }

      return var1;
   }

   public final void n5(com.aspose.slides.internal.v2.c8 var1) {
      if (var1 == null && this.e2()) {
         for (int var8 = 0; var8 < 256; var8++) {
            this.y4.n5(var8, var8);
            this.e2.n5(var8, var8);
         }
      } else if (!com.aspose.slides.internal.v2.c8.d4.equals(var1) && !com.aspose.slides.internal.v2.c8.y4k.equals(var1)) {
         for (int var7 = 0; var7 < 256; var7++) {
            this.y4.n5(z1[var7], var7);
            this.e2.n5(var7, z1[var7]);
         }
      } else {
         byte[] var2 = new byte[256];

         for (int var3 = 0; var3 < 256; var3++) {
            var2[var3] = (byte)var3;
         }

         String var9 = "Cp1252";
         if (com.aspose.slides.internal.v2.c8.d4.equals(var1)) {
            var9 = "MacRoman";
         }

         String var4 = com.aspose.slides.internal.g4.n5.n5(var2, var9);
         char[] var5 = d1.c8(var4);

         for (int var6 = 0; var6 < 256; var6++) {
            this.y4.n5(var5[var6], var6);
            this.e2.n5(var6, var5[var6]);
         }

         this.k5 = var9;
      }
   }

   public final void n5(com.aspose.slides.internal.v2.k5 var1, com.aspose.slides.internal.x2.k5 var2) {
      com.aspose.slides.internal.v2.n5 var3 = var1.c8(com.aspose.slides.internal.v2.c8.i4);
      if (var3 != null) {
         this.t9 = new com.aspose.slides.internal.g4.a6();
         int var4 = 0;

         for (int var5 = 0; var5 < var3.n5(); var5++) {
            com.aspose.slides.internal.v2.s7 var6 = var3.k5(var5);
            if (com.aspose.slides.internal.v6g.k5.l6(var6, com.aspose.slides.internal.v2.t2.class)) {
               var4 = ((com.aspose.slides.internal.v2.t2)var6).k5();
            } else {
               if (var2 == null) {
                  var2 = this.y4();
                  if (var2 == null) {
                     var2 = new com.aspose.slides.internal.x2.k5();
                  }
               }

               byte[] var7 = new byte[]{(byte)var4};
               String var8 = var2.n5(var7, 0, 1);
               if (var8 != null && var8.length() == 1) {
                  this.y4.n5(var8.charAt(0), var4);
                  this.e2.n5(var4, var8.charAt(0));
                  this.t9.n5(var8.charAt(0), var4);
               }

               var4++;
            }
         }
      }
   }

   public final com.aspose.slides.internal.v2.s7 l6(com.aspose.slides.internal.v2.s7 var1) {
      if (var1 == null) {
         return null;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.u9.class)) {
         return var1;
      }

      com.aspose.slides.internal.v2.u9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.v2.u9.class);
      return var2.k5();
   }

   private void n5(com.aspose.slides.internal.v2.k5 var1) {
      com.aspose.slides.internal.v2.s7 var2 = this.z3();
      com.aspose.slides.internal.v2.n5 var3 = var1.c8(com.aspose.slides.internal.v2.c8.p7);
      com.aspose.slides.internal.v2.k5 var4 = (com.aspose.slides.internal.v2.k5)var3.l6(0);
      com.aspose.slides.internal.v2.t2 var5 = var4.s7(com.aspose.slides.internal.v2.c8.r7);
      int var6 = 1000;
      if (var5 != null) {
         var6 = var5.k5();
      }

      com.aspose.slides.internal.g4.a6 var7 = this.n5(var4.c8(com.aspose.slides.internal.v2.c8.p6r));
      com.aspose.slides.internal.v2.k5 var8 = (com.aspose.slides.internal.v2.k5)var4.u9(com.aspose.slides.internal.v2.c8.n8);
      this.u9 = new u9(var8);
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.x8.class)) {
         com.aspose.slides.internal.v2.x8 var9 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.v2.x8.class);
         com.aspose.slides.internal.e7.s7 var10 = new com.aspose.slides.internal.e7.s7(var9);
         byte[] var11 = var10.n5();
         this.n5(var11, var7, var6);
      } else if (com.aspose.slides.internal.v2.c8.n5("Identity-H").equals(var2)) {
      }
   }

   private void n5(byte[] var1, com.aspose.slides.internal.g4.a6 var2, int var3) {
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var1);
      com.aspose.slides.internal.m6.u3 var5 = new com.aspose.slides.internal.m6.u3(var4);
      IGenericEnumerator var6 = var5.k5();
      Object var7 = null;
      boolean var8 = true;
      int var9 = 0;
      int var10 = 50;

      while (var8 || var9 > 0) {
         try {
            boolean var11 = var6.hasNext();
            if (!var11) {
               break;
            }

            var7 = com.aspose.slides.internal.v6g.k5.n5(var6.next(), com.aspose.slides.internal.h7.m1.class);
            if (var7 == null) {
               continue;
            }
         } catch (RuntimeException var26) {
            if (--var10 < 0) {
               break;
            }
            continue;
         }

         if (d1.a6(((com.aspose.slides.internal.h7.m1)var7).n5, "begin")) {
            var8 = false;
            var9++;
         } else if (d1.a6(((com.aspose.slides.internal.h7.m1)var7).n5, "end")) {
            var9--;
         } else if (d1.a6(((com.aspose.slides.internal.h7.m1)var7).n5, "beginbfchar")) {
            while (true) {
               boolean var29 = var6.hasNext();
               if (!var29) {
                  break;
               }

               com.aspose.slides.internal.h7.m1 var30 = com.aspose.slides.internal.v6g.k5.n5(var6.next(), com.aspose.slides.internal.h7.m1.class);
               if (var30 != null) {
                  if (d1.a6(var30.n5, "endbfchar")) {
                     break;
                  }
               } else {
                  String var31 = null;
                  com.aspose.slides.internal.v2.y4 var32 = com.aspose.slides.internal.v6g.k5.n5(var6.next(), com.aspose.slides.internal.v2.y4.class);
                  if (var32 != null) {
                     var31 = this.n5(var32);
                  }

                  boolean var34 = var6.hasNext();
                  if (var34) {
                     String var35 = null;
                     com.aspose.slides.internal.v2.y4 var36 = com.aspose.slides.internal.v6g.k5.n5(var6.next(), com.aspose.slides.internal.v2.y4.class);
                     if (var36 != null) {
                        var35 = this.n5(var36);
                     }

                     if (var31 != null && var35 != null && var35.length() == 1) {
                        char var37 = var31.charAt(0);
                        char var38 = var35.charAt(var35.length() - 1);
                        int var39 = var3;
                        if (var2.l6(var37)) {
                           var39 = var2.n5(var37);
                        }

                        this.n3.set_Item(Integer.valueOf(var38), new int[]{var37, var39});
                     }
                  }
               }
            }
         } else if (d1.a6(((com.aspose.slides.internal.h7.m1)var7).n5, "beginbfrange")) {
            while (true) {
               boolean var28 = var6.hasNext();
               if (!var28) {
                  break;
               }

               com.aspose.slides.internal.h7.m1 var12 = com.aspose.slides.internal.v6g.k5.n5(var6.next(), com.aspose.slides.internal.h7.m1.class);
               if (var12 != null) {
                  if (d1.a6(var12.n5, "endbfrange")) {
                     break;
                  }
               } else {
                  String var13 = null;
                  com.aspose.slides.internal.v2.y4 var14 = com.aspose.slides.internal.v6g.k5.n5(var6.next(), com.aspose.slides.internal.v2.y4.class);
                  if (var14 != null) {
                     var13 = this.n5(var14);
                  }

                  boolean var15 = var6.hasNext();
                  if (var15) {
                     String var16 = null;
                     com.aspose.slides.internal.v2.y4 var17 = com.aspose.slides.internal.v6g.k5.n5(var6.next(), com.aspose.slides.internal.v2.y4.class);
                     if (var17 != null) {
                        var16 = this.n5(var17);
                     }

                     int var18 = var13.charAt(0);
                     char var19 = var16.charAt(0);
                     var15 = var6.hasNext();
                     if (var15) {
                        Object var20 = var6.next();
                        if (com.aspose.slides.internal.v6g.k5.l6(var20, com.aspose.slides.internal.v2.y4.class)) {
                           com.aspose.slides.internal.v2.y4 var40 = com.aspose.slides.internal.v6g.k5.n5(var20, com.aspose.slides.internal.v2.y4.class);
                           String var41 = this.n5(var40);
                           if (var41.length() == 1) {
                              for (int var42 = var41.charAt(var41.length() - 1); var18 <= var19; var42++) {
                                 int var43 = var3;
                                 if (var2.l6(var18)) {
                                    var43 = var2.n5(var18);
                                 }

                                 this.n3.set_Item(var42, new int[]{var18, var43});
                                 var18++;
                              }
                           }
                        } else {
                           com.aspose.slides.internal.v2.n5 var21 = com.aspose.slides.internal.v6g.k5.n5(var20, com.aspose.slides.internal.v2.n5.class);
                           if (var21 != null) {
                              for (int var22 = 0; var22 < var21.n5(); var18++) {
                                 String var23 = this.n5(var21.u9(var22));
                                 if (var23.length() == 1) {
                                    char var24 = var23.charAt(var23.length() - 1);
                                    int var25 = var3;
                                    if (var2.l6(var18)) {
                                       var25 = var2.n5(var18);
                                    }

                                    this.n3.set_Item(Integer.valueOf(var24), new int[]{var18, var25});
                                 }

                                 var22++;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      var4.close();
   }

   private String n5(com.aspose.slides.internal.v2.y4 var1) {
      return com.aspose.slides.internal.g4.n5.n5(var1.n5(), "UnicodeBigUnmarked");
   }

   private com.aspose.slides.internal.g4.a6 n5(com.aspose.slides.internal.v2.n5 var1) {
      com.aspose.slides.internal.g4.a6 var2 = new com.aspose.slides.internal.g4.a6();
      if (var1 == null) {
         return var2;
      }

      for (int var3 = 0; var3 < var1.n5(); var3++) {
         int var4 = var1.u3(var3);
         com.aspose.slides.internal.v2.s7 var5 = var1.l6(++var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.n5.class)) {
            com.aspose.slides.internal.v2.n5 var10 = (com.aspose.slides.internal.v2.n5)var5;

            for (int var11 = 0; var11 < var10.n5(); var11++) {
               int var8 = var10.u3(var11);
               var2.n5(var4++, var8);
            }
         } else {
            int var6 = ((com.aspose.slides.internal.v2.t2)var5).k5();
            int var7 = var1.u3(++var3);

            while (var4 <= var6) {
               var2.n5(var4, var7);
               var4++;
            }
         }
      }

      return var2;
   }

   public final boolean e2() {
      com.aspose.slides.internal.v2.k5 var1 = this.n5.h0(com.aspose.slides.internal.v2.c8.n8);
      if (var1 == null) {
         return false;
      }

      com.aspose.slides.internal.v2.t2 var2 = var1.s7(com.aspose.slides.internal.v2.c8.o7);
      return var2 == null ? false : (var2.k5() & 4) != 0;
   }

   private a6 k7() {
      com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.n8);
      return var1 != null ? new u9(var1) : null;
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5;
   }

   public final String t9() {
      return this.n5.u3(com.aspose.slides.internal.v2.c8.y2);
   }

   public final void n5(String var1) {
      this.n5.n5(com.aspose.slides.internal.v2.c8.y2, var1);
   }

   public final m1 z1() {
      return l6;
   }

   public abstract float n5(byte[] var1, int var2, int var3);

   public abstract float l6(byte[] var1, int var2, int var3);

   public float n5(int var1) {
      float var2 = -1.0F;
      int var3 = this.u9();
      int var4 = this.h0();
      if (var1 < var3 || var1 > var4) {
         a6 var5 = this.t4();
         if (com.aspose.slides.internal.v6g.k5.l6(var5, u9.class)) {
            var2 = var5.a6();
         }
      } else if (!this.c8 && this.n3() != null && this.h0.size() > 0) {
         var2 = this.h0.get_Item(var1 - var3);
      }

      return var2;
   }

   public abstract String k5(byte[] var1, int var2, int var3);

   protected final String u3(byte[] var1, int var2, int var3) {
      String var4 = null;
      j5 var5 = j5.k5("ISO-8859-1");
      j5 var6 = j5.k5("UTF-16BE");
      if (var3 == 1) {
         var4 = var5.l6(new byte[]{(byte)(((var1[var2] & 255) + 256) % 256)});
      } else if (var3 == 2) {
         var4 = var6.l6(new byte[]{(byte)(((var1[var2] & 255) + 256) % 256), (byte)(((var1[var2 + 1] & 255) + 256) % 256)});
      }

      return var4;
   }

   public final int a6(byte[] var1, int var2, int var3) {
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         var4 <<= 8;
         var4 |= ((var1[var2 + var5] & 255) + 256) % 256;
      }

      return var4;
   }

   public final a6 t4() {
      if (this.u9 == null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.n8);
         if (var1 != null) {
            this.u9 = new u9(var1);
         }
      }

      return this.u9;
   }

   public final void n5(u9 var1) {
      com.aspose.slides.internal.v2.k5 var2 = null;
      if (var1 != null) {
         var2 = (com.aspose.slides.internal.v2.k5)var1.t2();
      }

      this.n5.l6(com.aspose.slides.internal.v2.c8.n8, var2);
      this.u9 = var1;
   }

   public abstract float q0();

   public final com.aspose.slides.internal.v2.s7 z3() {
      return this.n5.u9(com.aspose.slides.internal.v2.c8.n9q);
   }

   public float l6() {
      float var1;
      if (this.a6 != 0.0F) {
         var1 = this.a6;
      } else {
         float var2 = 0.0F;
         float var3 = 0.0F;
         com.aspose.slides.internal.v2.n5 var4 = (com.aspose.slides.internal.v2.n5)this.n5.u9(com.aspose.slides.internal.v2.c8.e4w);
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.n5(); var5++) {
               com.aspose.slides.internal.v2.t2 var6 = (com.aspose.slides.internal.v2.t2)var4.l6(var5);
               if (var6.u3() > 0.0F) {
                  var2 += var6.u3();
                  var3++;
               }
            }
         }

         if (var2 > 0.0F) {
            var1 = var2 / var3;
         } else {
            var1 = 0.0F;
         }

         this.a6 = var1;
      }

      return var1;
   }

   public byte[] m1() {
      u9 var1 = com.aspose.slides.internal.v6g.k5.n5(this.t4(), u9.class);
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.e7.s7 var2 = var1.y4();
      if (var2 == null) {
         var2 = var1.e2();
      }

      com.aspose.slides.internal.e7.s7 var3 = var2;
      if (var3 == null) {
         return null;
      }

      try {
         n2 var4 = new n2(0, new m3(var3.n5()));
         u0a var5 = com.aspose.slides.internal.v6g.k5.n5(i2.n5(var4), u0a.class);
         if (var5 != null) {
            if (d1.n5(var5.u9())) {
               if (!var5.l6().u3().a0()) {
                  var5.m1();
                  var5.l6().u3().n5(true);
               }

               String var6 = null;
               String[] var7 = new String[]{var6};
               var5.u3(var1.n5(var7));
               var6 = var7[0];
               var5.n5(var5.u9());
               var5.l6(var6);
            }

            this.n5(var5);
            if (var5.l6().x8() == null) {
               var5.z3();
            }

            com.aspose.slides.internal.z0k.e2 var14 = new com.aspose.slides.internal.z0k.e2();

            try {
               var5.n5(var14);
               return var14.toArray();
            } finally {
               if (var14 != null) {
                  var14.dispose();
               }
            }
         } else {
            return null;
         }
      } catch (l0 var12) {
         return null;
      }
   }

   private void n5(u0a var1) {
      boolean var2 = true;
      Dictionary var3 = new Dictionary();
      com.aspose.slides.internal.x2.k5 var4 = ((t2)this).k7();
      n3c var5 = null;
      int[] var6 = null;
      if (var1.l6().c8() != null) {
         var5 = var1.l6().c8().n5();
         if (var5 == null) {
            var5 = var1.l6().c8().l6();
            var2 = false;
         }

         var6 = var5.n5();
      }

      if (var4 != null && var4.n5().size() > 0) {
         if (var6 != null && var6.length > 0 && var4.k5()) {
            Dictionary$Enumerator var7 = var4.n5().iterator();

            try {
               while (var7.hasNext()) {
                  KeyValuePair var8 = (KeyValuePair)var7.next();
                  int var9 = var5.n5((Integer)var8.getKey());
                  if (var2 && (Integer)var8.getKey() < var1.q0() && var9 == 0 && (Integer)var8.getKey() < 256) {
                     var9 = var5.n5((char)(61440 + (Integer)var8.getKey()));
                  }

                  if (var9 != 0) {
                     var3.addItem(var9, var8.getValue());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         } else {
            var3 = var4.n5();
         }

         var1.n5(var3);
      }
   }
}
