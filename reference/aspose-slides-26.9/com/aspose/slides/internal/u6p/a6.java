package com.aspose.slides.internal.u6p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.m3;
import com.aspose.slides.internal.h3d.n3;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.h3d.s7;
import com.aspose.slides.internal.h3d.x8;
import com.aspose.slides.internal.h3d.z1;
import com.aspose.slides.internal.p4l.e2;
import com.aspose.slides.internal.p4l.k7;
import com.aspose.slides.internal.p4l.t9;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s4;
import com.aspose.slides.ms.System.w5;
import com.aspose.slides.ms.System.y4;
import com.aspose.slides.ms.System.y8;

class a6 {
   private n3 n5;
   private s3 l6 = new s3();
   private m3 k5;
   private z1 u3;
   private Hashtable a6 = new Hashtable();
   private Hashtable u9 = new Hashtable();
   private Object h0 = null;
   private long c8 = 0L;
   private long t2 = 0L;
   private byte[] s7;
   private int x8 = 4096;

   public a6(l6 var1) {
      this.n5 = var1.a6();
      var1.u3().n5(this.l6);
      this.k5 = var1.k5();
      this.u3 = new z1(this.n5, this.l6.k5());
   }

   public void n5(byte var1, com.aspose.slides.internal.z0k.n5 var2, boolean var3, Object[] var4, Object[][] var5) {
      var5[0] = null;
      boolean var6 = this.n5(var1, var2);
      if (var6) {
         do {
            if (var3 && var5[0] == null) {
               var5[0] = (Object[])this.n5();
            } else if (this.t2 == 0L) {
               this.t2 = this.c8;
            }
         } while (this.n5(var2));
      }

      var4[0] = this.u3.l6(this.t2);
   }

   private boolean n5(byte var1, com.aspose.slides.internal.z0k.n5 var2) {
      if (var1 == 11) {
         this.u3.n5();
         this.u3.l6();
         return false;
      }

      c4 var3 = null;
      long var4 = 0L;
      long[] var6 = new long[]{0L};
      Object[] var7 = new Object[]{this.h0};
      c4[] var8 = new c4[]{var3};
      this.n5(var1, var2, var6, var7, var8);
      var4 = var6[0];
      this.h0 = var7[0];
      var3 = var8[0];
      if (var4 != 0L) {
         this.n5(var4, this.h0, var3, 0L, null, null);
         this.c8 = var4;
      }

      return true;
   }

   public boolean n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.z1() & 255;
      byte var3 = (byte)var2;
      if (var3 == 11) {
         this.u3.n5();
         this.u3.l6();
         return false;
      }

      c4 var4 = null;
      long var5 = 0L;
      long[] var7 = new long[]{0L};
      Object[] var8 = new Object[]{this.h0};
      c4[] var9 = new c4[]{var4};
      this.n5(var3, var1, var7, var8, var9);
      var5 = var7[0];
      this.h0 = var8[0];
      var4 = var9[0];
      if (var5 != 0L) {
         this.n5(var5, this.h0, var4, 0L, null, null);
         this.c8 = var5;
      }

      return true;
   }

   public Object n5() {
      return this.h0;
   }

   private void n5(byte var1, com.aspose.slides.internal.z0k.n5 var2, long[] var3, Object[] var4, c4[] var5) {
      switch (var1) {
         case 1:
            this.n5(var2, var3, var4, var5);
            break;
         case 2:
            this.n5(var2, true, false, var3, var4, var5);
            break;
         case 3:
            this.n5(var2, false, false, var3, var4, var5);
            break;
         case 4:
            this.n5(var2, true, true, var3, var4, var5);
            break;
         case 5:
            this.n5(var2, false, true, var3, var4, var5);
            break;
         case 6:
            var5[0] = null;
            this.n5(var2, var3, var4);
            break;
         case 7:
            var5[0] = null;
            this.l6(var2, var3, var4);
            break;
         case 8:
            var4[0] = this.k5(var2);
            var3[0] = 0L;
            var5[0] = null;
            break;
         case 9:
         case 11:
         default:
            throw new SerializationException(d1.n5(new Object[]{"Unexpected binary element: ", Integer.valueOf(var1)}));
         case 10:
            var4[0] = null;
            var3[0] = 0L;
            var5[0] = null;
            break;
         case 12:
            this.l6(var2);
            this.n5((byte)(var2.z1() & 0xFF), var2, var3, var4, var5);
            break;
         case 13:
            var4[0] = new a6$n5(var2.z1() & 255);
            var3[0] = 0L;
            var5[0] = null;
            break;
         case 14:
            var4[0] = new a6$n5(var2.m3());
            var3[0] = 0L;
            var5[0] = null;
            break;
         case 15:
            this.k5(var2, var3, var4);
            var5[0] = null;
            break;
         case 16:
            this.u3(var2, var3, var4);
            var5[0] = null;
            break;
         case 17:
            this.a6(var2, var3, var4);
            var5[0] = null;
      }
   }

   private void l6(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.c4() & 4294967295L;
      String var4 = var1.j5();
      this.a6.set_Item(var2, var4);
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, boolean var2, boolean var3, long[] var4, Object[] var5, c4[] var6) {
      var4[0] = var1.c4() & 4294967295L;
      a6$l6 var7 = this.n5(var1, var2, var3);
      this.n5(var1, var7, var4[0], var5, var6);
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, long[] var2, Object[] var3, c4[] var4) {
      var2[0] = var1.c4() & 4294967295L;
      long var5 = var1.c4() & 4294967295L;
      Object var7 = this.u3.l6(var5);
      if (var7 == null) {
         throw new SerializationException("Invalid binary format");
      }

      a6$l6 var8 = (a6$l6)this.u9.get_Item(j8.n5(var7));
      this.n5(var1, var8, var2[0], var3, var4);
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, a6$l6 var2, long var3, Object[] var5, c4[] var6) {
      var5[0] = com.aspose.slides.internal.h3d.u9.n5(var2.n5);
      this.u3.n5(var5[0]);
      var5[0] = com.aspose.slides.internal.h3d.u9.n5(var2.n5);
      var6[0] = var2.u9 ? new c4(var2.n5, new com.aspose.slides.internal.h3d.a6()) : null;
      if (var2.k5 != null) {
         for (int var7 = 0; var7 < var2.a6; var7++) {
            this.n5(var1, var5[0], var3, var6[0], var2.l6[var7], var2.k5[var7], null, null);
         }
      } else {
         for (int var8 = 0; var8 < var2.a6; var8++) {
            if (var2.u3[var8] != null) {
               this.n5(var1, var5[0], var3, var6[0], var2.l6[var8], var2.u3[var8].s7(), var2.u3[var8], null);
            } else if (com.aspose.slides.internal.u6p.n5.n5(var2.l6[var8])) {
               n5(var1, var2.l6[var8]);
            }
         }
      }
   }

   private void n5(long var1, Object var3, c4 var4, long var5, e2 var7, int[] var8) {
      if (var5 == 0L) {
         var8 = null;
      }

      if (j8.n5(var3).y1() && var5 != 0L) {
         if (var8 != null) {
            var8 = (int[])var8.clone();
         }

         this.u3.n5(var3, var1, var4, var5, var7, var8);
      } else {
         this.u3.n5(var3, var1, var4, 0L, null, null);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, long[] var2, Object[] var3) {
      var2[0] = var1.c4() & 4294967295L;
      var3[0] = var1.j5();
   }

   private void l6(com.aspose.slides.internal.z0k.n5 var1, long[] var2, Object[] var3) {
      var2[0] = var1.c4() & 4294967295L;
      var1.z1();
      int var4 = var1.m3();
      boolean var5 = false;
      int[] var6 = new int[var4];

      for (int var7 = 0; var7 < var4; var7++) {
         var6[var7] = var1.m3();
         if (var6[var7] == 0) {
            var5 = true;
         }
      }

      byte var13 = (byte)(var1.z1() & 0xFF);
      y8 var8 = this.n5(var1, var13);
      com.aspose.slides.ms.System.u3 var9 = com.aspose.slides.ms.System.u3.n5(var8, var6);
      if (var5) {
         var3[0] = var9;
      } else {
         int[] var10 = new int[var4];

         for (int var11 = var4 - 1; var11 >= 0; var11--) {
            var10[var11] = var9.l6(var11);
         }

         boolean var14 = false;

         while (!var14) {
            this.n5(var1, var9, var2[0], null, var8, null, null, var10);

            for (int var12 = var9.u3() - 1; var12 >= 0; var12--) {
               var10[var12]++;
               if (var10[var12] <= var9.u3(var12)) {
                  break;
               }

               if (var12 <= 0) {
                  var14 = true;
                  break;
               }

               var10[var12] = var9.l6(var12);
            }
         }

         var3[0] = var9;
      }
   }

   private Object k5(com.aspose.slides.internal.z0k.n5 var1) {
      y8 var2 = this.n5(var1, (byte)0);
      return n5(var1, var2);
   }

   private void k5(com.aspose.slides.internal.z0k.n5 var1, long[] var2, Object[] var3) {
      var2[0] = var1.c4() & 4294967295L;
      int var4 = var1.m3();
      y8 var5 = this.n5(var1, (byte)0);
      switch (y8.u3(var5)) {
         case 3:
            boolean[] var23 = new boolean[var4];

            for (int var38 = 0; var38 < var4; var38++) {
               var23[var38] = var1.t9();
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var23));
            break;
         case 4:
            char[] var22 = new char[var4];
            int var37 = 0;

            while (var37 < var4) {
               int var39 = var1.n5(var22, var37, var4 - var37);
               if (var39 == 0) {
                  break;
               }

               var37 += var39;
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var22));
            break;
         case 5:
            byte[] var21 = new byte[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var21)), 1);
            } else {
               for (int var36 = 0; var36 < var4; var36++) {
                  var21[var36] = var1.t4();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var21));
            break;
         case 6:
            byte[] var20 = new byte[var4];
            int var35 = 0;

            while (var35 < var4) {
               int var8 = var1.n5(var20, var35, var4 - var35);
               if (var8 == 0) {
                  break;
               }

               var35 += var8;
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var20));
            break;
         case 7:
            short[] var19 = new short[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var19)), 2);
            } else {
               for (int var34 = 0; var34 < var4; var34++) {
                  var19[var34] = var1.k7();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var19));
            break;
         case 8:
            int[] var18 = new int[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var18)), 2);
            } else {
               for (int var33 = 0; var33 < var4; var33++) {
                  var18[var33] = var1.r4();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var18));
            break;
         case 9:
            int[] var17 = new int[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var17)), 4);
            } else {
               for (int var32 = 0; var32 < var4; var32++) {
                  var17[var32] = var1.m3();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var17));
            break;
         case 10:
            long[] var16 = new long[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var16)), 4);
            } else {
               for (int var31 = 0; var31 < var4; var31++) {
                  var16[var31] = var1.c4();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var16));
            break;
         case 11:
            long[] var15 = new long[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var15)), 8);
            } else {
               for (int var30 = 0; var30 < var4; var30++) {
                  var15[var30] = var1.z8();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var15));
            break;
         case 12:
            long[] var14 = new long[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var14)), 8);
            } else {
               for (int var29 = 0; var29 < var4; var29++) {
                  var14[var29] = var1.y2();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var14));
            break;
         case 13:
            float[] var13 = new float[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var13)), 4);
            } else {
               for (int var28 = 0; var28 < var4; var28++) {
                  var13[var28] = var1.w1();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var13));
            break;
         case 14:
            double[] var12 = new double[var4];
            if (var4 > 2) {
               this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(var12)), 8);
            } else {
               for (int var27 = 0; var27 < var4; var27++) {
                  var12[var27] = var1.m1();
               }
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var12));
            break;
         case 15:
            com.aspose.slides.ms.System.c4[] var11 = new com.aspose.slides.ms.System.c4[var4];

            for (int var26 = 0; var26 < var4; var26++) {
               var11[var26] = var1.z3();
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var11));
            break;
         case 16:
            j5[] var10 = w5.n5(j5.class, var4);

            for (int var25 = 0; var25 < var4; var25++) {
               j5.u3(var1.z8()).u3(var10[var25]);
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var10));
            break;
         case 17:
         default:
            if (var5 != com.aspose.slides.internal.v6g.k5.n5(s4.class)) {
               throw new NotSupportedException(d1.n5(new String[]{"Unsupported primitive type: ", var5.q0()}));
            }

            s4[] var9 = w5.n5(s4.class, var4);

            for (int var24 = 0; var24 < var4; var24++) {
               var9[var24] = new s4(var1.z8());
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var9));
            break;
         case 18:
            String[] var6 = new String[var4];

            for (int var7 = 0; var7 < var4; var7++) {
               var6[var7] = var1.j5();
            }

            var3[0] = com.aspose.slides.ms.System.u3.n5((Object)(var6));
      }
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, com.aspose.slides.ms.System.u3 var2, int var3) {
      int var4 = y4.n5(var2);
      if (this.s7 == null || var4 > this.s7.length && this.s7.length != this.x8) {
         this.s7 = new byte[var4 <= this.x8 ? var4 : this.x8];
      }

      int var5 = 0;

      while (var4 > 0) {
         int var6 = var4 < this.s7.length ? var4 : this.s7.length;
         int var7 = 0;

         do {
            int var8 = var1.n5(this.s7, var7, var6 - var7);
            if (var8 == 0) {
               break;
            }

            var7 += var8;
         } while (var7 < var6);

         y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.s7)), 0, var2, var5, var6);
         var4 -= var6;
         var5 += var6;
      }
   }

   private void u3(com.aspose.slides.internal.z0k.n5 var1, long[] var2, Object[] var3) {
      this.n5(var1, com.aspose.slides.internal.v6g.k5.n5(Object.class), var2, var3);
   }

   private void a6(com.aspose.slides.internal.z0k.n5 var1, long[] var2, Object[] var3) {
      this.n5(var1, com.aspose.slides.internal.v6g.k5.n5(String.class), var2, var3);
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, y8 var2, long[] var3, Object[] var4) {
      var3[0] = var1.c4() & 4294967295L;
      int var5 = var1.m3();
      int[] var6 = new int[1];
      com.aspose.slides.ms.System.u3 var7 = com.aspose.slides.ms.System.u3.n5(var2, var5);

      for (int var9 = 0; var9 < var5; var9++) {
         var6[0] = var9;
         this.n5(var1, var7, var3[0], null, var2, null, null, var6);
         var9 = var6[0];
      }

      var4[0] = var7;
   }

   private a6$l6 n5(com.aspose.slides.internal.z0k.n5 var1, boolean var2, boolean var3) {
      a6$l6 var4 = new a6$l6(null);
      String var5 = var1.j5();
      int var6 = var1.m3();
      y8[] var7 = new y8[var6];
      String[] var8 = new String[var6];

      for (int var9 = 0; var9 < var6; var9++) {
         var8[var9] = var1.j5();
      }

      if (var3) {
         byte[] var15 = new byte[var6];

         for (int var10 = 0; var10 < var6; var10++) {
            var15[var10] = (byte)(var1.z1() & 0xFF);
         }

         for (int var19 = 0; var19 < var6; var19++) {
            y8 var11 = this.n5(var1, var15[var19], false);
            if (var11 == null) {
               var11 = com.aspose.slides.internal.v6g.k5.n5(Object.class);
            }

            var7[var19] = var11;
         }
      }

      var4.n5 = y8.l6(var5, true);
      var4.l6 = var7;
      var4.k5 = var8;
      var4.a6 = var8.length;
      if (this.n5 != null) {
         n3 var16 = null;
         n3[] var20 = new n3[]{var16};
         x8 var22 = this.n5.n5(var4.n5, this.l6.k5(), var20);
         var16 = var20[0];
         var4.u9 = var22 != null;
      }

      if (!var4.u9) {
         if (!var4.n5.d5()) {
            throw new SerializationException("Serializable objects must be marked with the Serializable attribute");
         }

         var4.u9 = com.aspose.slides.internal.v6g.k5.n5(s7.class).l6(var4.n5);
         if (!var4.u9) {
            var4.u3 = new e2[var6];

            for (int var18 = 0; var18 < var6; var18++) {
               com.aspose.slides.internal.p4l.y4 var21 = null;
               String var23 = var8[var18];
               int var12 = d1.u3(var23, '+');
               if (var12 != -1) {
                  String var13 = d1.l6(var8[var18], 0, var12);
                  var23 = d1.k5(var8[var18], var12 + 1);

                  for (y8 var14 = var4.n5.n5(); var14 != null; var14 = var14.n5()) {
                     if (d1.a6(var14.s7(), var13)) {
                        var21 = var14.n5(var23, 52);
                        break;
                     }
                  }
               } else {
                  var21 = var4.n5.n5(var23, 52);
               }

               if (var21 != null) {
                  var4.u3[var18] = var21;
               }

               if (!var3) {
                  var7[var18] = var21.a6();
               }
            }

            var4.k5 = null;
         }
      }

      if (!this.u9.containsKey(var4.n5)) {
         this.u9.set_Item(var4.n5, var4);
      }

      return var4;
   }

   static boolean n5(e2 var0) {
      if (var0 == null) {
         return false;
      }

      y8 var1 = null;
      switch (var0.l6()) {
         case 4:
            var1 = ((com.aspose.slides.internal.p4l.y4)var0).a6();
            return var1 != null && var1.a6();
         default:
            throw new NotSupportedException(d1.n5(new String[]{"Not supported: ", d5.getName(t9.class, var0.l6())}));
      }
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, Object var2, long var3, c4 var5, y8 var6, String var7, e2 var8, int[] var9) {
      Object var10 = null;
      if (com.aspose.slides.internal.u6p.n5.n5(var6) && !n5(var8)) {
         var10 = n5(var1, var6);
         this.n5(var2, var7, var8, var5, var10, var6, var9);
      } else {
         byte var11 = (byte)(var1.z1() & 0xFF);
         if (var11 == 9) {
            long var22 = var1.c4() & 4294967295L;
            this.n5(var3, var22, var2, var5, var7, var8, var9);
         } else {
            long var12 = 0L;
            c4 var14 = null;
            long[] var15 = new long[]{0L};
            Object[] var16 = new Object[]{var10};
            c4[] var17 = new c4[]{var14};
            this.n5(var11, var1, var15, var16, var17);
            var12 = var15[0];
            var10 = var16[0];
            var14 = var17[0];
            boolean var18 = false;
            if (var12 != 0L) {
               if (j8.n5(var10).y1()) {
                  this.n5(var3, var12, var2, var5, var7, var8, var9);
                  var18 = true;
               }

               if (var5 == null && !(var2 instanceof com.aspose.slides.ms.System.u3)) {
                  this.n5(var12, var10, var14, var3, var8, null);
               } else {
                  this.n5(var12, var10, var14, var3, null, var9);
               }
            }

            if (!var18) {
               this.n5(var2, var7, var8, var5, var10, var6, var9);
            }
         }
      }
   }

   private void n5(Object var1, String var2, e2 var3, c4 var4, Object var5, y8 var6, int[] var7) {
      if (var5 instanceof com.aspose.slides.internal.h3d.t2) {
         var5 = ((com.aspose.slides.internal.h3d.t2)var5).n5(this.l6.k5());
      }

      if (var1 instanceof com.aspose.slides.ms.System.u3) {
         if (var5 instanceof a6$n5) {
            int var8 = ((a6$n5)var5).n5;
            var7[0] += var8 - 1;
         } else {
            ((com.aspose.slides.ms.System.u3)var1).l6(var5, var7);
         }
      } else {
         if (var4 != null) {
            var4.n5(var2, var5, var6);
         }

         if (var3 == null) {
            e2[] var9 = y8.k5(var4.l6()).l6(var2);
            if (var9.length == 1) {
               var3 = var9[0];
            }
         }

         if (var3 != null) {
            if (var3 instanceof com.aspose.slides.internal.p4l.y4) {
               if (!((com.aspose.slides.internal.p4l.y4)var3).u3().isAccessible()) {
                  ((com.aspose.slides.internal.p4l.y4)var3).u3().setAccessible(true);
               }

               ((com.aspose.slides.internal.p4l.y4)var3).n5(var1, var5);
            } else {
               if (!((k7)var3).u3().m1().isAccessible()) {
                  ((k7)var3).u3().m1().setAccessible(true);
               }

               ((k7)var3).n5(var1, var5, null);
            }
         }
      }
   }

   private void n5(long var1, long var3, Object var5, c4 var6, String var7, e2 var8, int[] var9) {
      if (var6 != null) {
         this.u3.n5(var1, var7, var3);
      } else if (var5 instanceof com.aspose.slides.ms.System.u3) {
         if (var9.length == 1) {
            this.u3.n5(var1, var9[0], var3);
         } else {
            this.u3.n5(var1, (int[])var9.clone(), var3);
         }
      } else {
         this.u3.n5(var1, var8, var3);
      }
   }

   public y8 n5(com.aspose.slides.internal.z0k.n5 var1, byte var2) {
      return this.n5(var1, var2, true);
   }

   public y8 n5(com.aspose.slides.internal.z0k.n5 var1, byte var2, boolean var3) {
      switch (var2) {
         case 0:
            return com.aspose.slides.internal.u6p.n5.n5(var1.z1() & 255);
         case 1:
            return com.aspose.slides.internal.v6g.k5.n5(String.class);
         case 2:
            return com.aspose.slides.internal.v6g.k5.n5(Object.class);
         case 3:
            String var6 = var1.j5();
            y8 var5 = y8.k5(var6);
            if (var5 != null) {
               return var5;
            }

            throw new SerializationException(d1.n5("Could not find type '{0}'.", new Object[]{var6}));
         case 4:
            throw new NotImplementedException();
         case 5:
            return com.aspose.slides.internal.v6g.k5.n5(Object[].class);
         case 6:
            return com.aspose.slides.internal.v6g.k5.n5(String[].class);
         case 7:
            y8 var4 = com.aspose.slides.internal.u6p.n5.n5(var1.z1() & 255);
            return y8.k5(d1.n5(new String[]{var4.q0(), "[]"}));
         default:
            throw new NotSupportedException("Unknow type tag");
      }
   }

   public static Object n5(com.aspose.slides.internal.z0k.n5 var0, y8 var1) {
      if (var1 == null) {
         return null;
      }

      switch (y8.u3(var1)) {
         case 3:
            return var0.t9();
         case 4:
            return var0.q0();
         case 5:
            return var0.t4();
         case 6:
            return var0.z1();
         case 7:
            return var0.k7();
         case 8:
            return var0.r4();
         case 9:
            return var0.m3();
         case 10:
            return var0.c4();
         case 11:
            return var0.z8();
         case 12:
            return var0.y2();
         case 13:
            return var0.w1();
         case 14:
            return var0.m1();
         case 15:
            return com.aspose.slides.ms.System.c4.l6(var0.j5(), com.aspose.slides.internal.x7n.l6.k5());
         case 16:
            return j5.u3(var0.z8());
         case 17:
         default:
            if (var1 == com.aspose.slides.internal.v6g.k5.n5(s4.class)) {
               return new s4(var0.z8());
            }

            throw new NotSupportedException(d1.n5(new String[]{"Unsupported primitive type: ", var1.q0()}));
         case 18:
            return var0.j5();
      }
   }
}
