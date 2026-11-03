package com.aspose.slides.internal.u6p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.e2;
import com.aspose.slides.internal.h3d.n3;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.h3d.s7;
import com.aspose.slides.internal.h3d.x8;
import com.aspose.slides.internal.h3d.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s4;
import com.aspose.slides.ms.System.y4;
import com.aspose.slides.ms.System.y8;

class h0 {
   private e2 u3 = new e2();
   private Hashtable a6 = new Hashtable();
   private Queue u9 = new Queue();
   private Hashtable h0 = new Hashtable();
   static final Hashtable n5 = new Hashtable();
   static com.aspose.slides.internal.p4l.n5 l6 = com.aspose.slides.internal.v6g.k5.n5(String.class).t4();
   static String k5 = com.aspose.slides.internal.v6g.k5.n5(String.class).t4().l6();
   private n3 c8;
   private s3 t2 = new s3();
   private int s7;
   private int x8;
   private byte[] n3;
   private int y4 = 4096;
   private y1 e2;

   public h0(l6 var1) {
      this.c8 = var1.a6();
      var1.u3().n5(this.t2);
      this.s7 = var1.l6();
      this.x8 = var1.u9();
      this.e2 = new y1(var1.u3().k5());
   }

   public void n5(com.aspose.slides.internal.z0k.l6 var1, Object var2, Object[] var3) {
      this.u9.clear();
      if (var3 != null) {
         this.n5(var3);
      }

      this.n5(var2);
      this.n5(var1);
      l6(var1);
      this.e2.n5();
   }

   public void n5(Object var1) {
      this.u9.enqueue(var1);
   }

   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      while (this.u9.size() > 0) {
         this.n5(var1, this.u9.dequeue(), false);
      }
   }

   public void n5(com.aspose.slides.internal.z0k.l6 var1, Object var2, boolean var3) {
      boolean var4 = false;
      long var5;
      if (var3) {
         var5 = this.u3.n5();
      } else {
         boolean[] var7 = new boolean[]{false};
         var5 = this.u3.n5(var2, var7);
         var4 = var7[0];
      }

      if (var2 instanceof String) {
         this.n5(var1, var5, (String)var2);
      } else if (var2 instanceof com.aspose.slides.ms.System.u3) {
         this.n5(var1, var5, (com.aspose.slides.ms.System.u3)var2);
      } else {
         this.n5(var1, var5, var2);
      }
   }

   public static void l6(com.aspose.slides.internal.z0k.l6 var0) {
      var0.n5((byte)11);
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, long var2, Object var4) {
      Object var5 = null;
      t2 var6 = null;
      t2[] var7 = new t2[]{var6};
      Object[] var8 = new Object[]{var5};
      this.n5(var4, var7, var8);
      var6 = var7[0];
      var5 = var8[0];
      h0$n5 var9 = (h0$n5)this.a6.get_Item(var6.k5);
      if (var9 != null && var6.n5(var9.n5)) {
         var1.n5((byte)1);
         var1.l6((int)var2);
         var1.l6((int)var9.l6);
         var6.n5(this, var1, var5);
      } else {
         if (var9 == null) {
            var9 = new h0$n5(var6, var2);
            this.a6.set_Item(var6.k5, var9);
         }

         boolean var10 = var6.n5() || this.x8 == 1;
         int var11;
         int var12;
         if (d1.a6(var6.l6, k5)) {
            var11 = var10 ? 4 : 2;
            var12 = -1;
         } else {
            var11 = var10 ? 5 : 3;
            var12 = this.n5(var1, var6.l6);
         }

         var6.n5(this, var1);
         var1.n5((byte)var11);
         var1.l6((int)var2);
         var1.n5(var6.k5);
         var6.n5(this, var1, var10);
         if (var12 != -1) {
            var1.l6(var12);
         }

         var6.n5(this, var1, var5);
      }
   }

   private void n5(Object var1, t2[] var2, Object[] var3) {
      y8 var4 = j8.n5(var1);
      if (this.c8 != null) {
         n3 var5 = null;
         n3[] var6 = new n3[]{var5};
         x8 var7 = this.c8.n5(var4, this.t2.k5(), var6);
         var5 = var6[0];
         if (var7 != null) {
            c4 var18 = new c4(var4, new com.aspose.slides.internal.h3d.a6());
            var7.n5(var1, var18, this.t2.k5());
            var2[0] = new c8(var4, var18);
            var3[0] = var18;
            return;
         }
      }

      com.aspose.slides.internal.u6p.n5.n5(var4, this.c8, this.t2.k5());
      this.e2.n5(var1);
      s7 var14 = var1 instanceof s7 ? (s7)var1 : null;
      if (var14 != null) {
         c4 var15 = new c4(var4, new com.aspose.slides.internal.h3d.a6());
         var14.getObjectData(var15, this.t2.k5());
         var2[0] = new c8(var4, var15);
         var3[0] = var15;
      } else {
         var3[0] = var1;
         if (this.t2.n5() != null) {
            var2[0] = new u3(var4, this.t2.k5());
            return;
         }

         boolean var17 = false;
         Hashtable var16;
         synchronized (n5) {
            var16 = (Hashtable)n5.get_Item(this.t2.l6());
            if (var16 == null) {
               var16 = new Hashtable();
               n5.set_Item(this.t2.l6(), var16);
               var17 = true;
            }
         }

         var2[0] = null;
         synchronized (var16) {
            if (!var17) {
               var2[0] = (t2)var16.get_Item(var4);
            }

            if (var2[0] == null) {
               var2[0] = this.l6(var4);
            }

            var16.set_Item(var4, var2[0]);
         }
      }
   }

   private t2 l6(y8 var1) {
      if (!com.aspose.slides.internal.u6p.n5.u3) {
         throw new NotImplementedException();
      } else {
         return new u3(var1, this.t2.k5());
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, long var2, com.aspose.slides.ms.System.u3 var4) {
      y8 var5 = j8.n5(com.aspose.slides.ms.System.u3.n5(var4)).h0();
      if (var5 == com.aspose.slides.internal.v6g.k5.n5(Object.class) && var4.u3() == 1) {
         this.k5(var1, var2, var4);
      } else if (var5 == com.aspose.slides.internal.v6g.k5.n5(String.class) && var4.u3() == 1) {
         this.u3(var1, var2, var4);
      } else if (com.aspose.slides.internal.u6p.n5.n5(var5) && var4.u3() == 1) {
         this.a6(var1, var2, var4);
      } else {
         this.l6(var1, var2, var4);
      }
   }

   private void l6(com.aspose.slides.internal.z0k.l6 var1, long var2, com.aspose.slides.ms.System.u3 var4) {
      y8 var5 = j8.n5(com.aspose.slides.ms.System.u3.n5(var4)).h0();
      if (!var5.s3()) {
         this.n5(var1, var5.t4());
      }

      var1.n5((byte)7);
      var1.l6((int)var2);
      if (var5.s3()) {
         var1.n5((byte)1);
      } else if (var4.u3() == 1) {
         var1.n5((byte)0);
      } else {
         var1.n5((byte)2);
      }

      var1.l6(var4.u3());

      for (int var6 = 0; var6 < var4.u3(); var6++) {
         var1.l6(var4.u3(var6) + 1);
      }

      n5(var1, var5);
      this.l6(var1, var5);
      if (var4.u3() == 1 && !var5.y1()) {
         this.n5(var1, var4, var5);
      } else {
         for (Object var7 : var4) {
            this.n5(var1, var5, var7);
         }
      }
   }

   private void k5(com.aspose.slides.internal.z0k.l6 var1, long var2, com.aspose.slides.ms.System.u3 var4) {
      var1.n5((byte)16);
      var1.l6((int)var2);
      var1.l6(var4.a6());
      this.n5(var1, var4, com.aspose.slides.internal.v6g.k5.n5(Object.class));
   }

   private void u3(com.aspose.slides.internal.z0k.l6 var1, long var2, com.aspose.slides.ms.System.u3 var4) {
      var1.n5((byte)17);
      var1.l6((int)var2);
      var1.l6(var4.a6());
      this.n5(var1, var4, com.aspose.slides.internal.v6g.k5.n5(String.class));
   }

   private void a6(com.aspose.slides.internal.z0k.l6 var1, long var2, com.aspose.slides.ms.System.u3 var4) {
      var1.n5((byte)15);
      var1.l6((int)var2);
      var1.l6(var4.a6(0));
      y8 var5 = j8.n5(com.aspose.slides.ms.System.u3.n5(var4)).h0();
      this.l6(var1, var5);
      switch (y8.u3(var5)) {
         case 3:
            for (boolean var59 : (boolean[])com.aspose.slides.ms.System.u3.n5(var4)) {
               var1.l6(var59);
            }
            break;
         case 4:
            var1.n5((char[])com.aspose.slides.ms.System.u3.n5(var4));
            break;
         case 5:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 1);
            } else {
               for (byte var58 : (byte[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.n5(var58);
               }
            }
            break;
         case 6:
            var1.n5((byte[])com.aspose.slides.ms.System.u3.n5(var4));
            break;
         case 7:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 2);
            } else {
               for (short var57 : (short[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.n5(var57);
               }
            }
            break;
         case 8:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 2);
            } else {
               for (int var56 : (int[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.n5(var56);
               }
            }
            break;
         case 9:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 4);
            } else {
               for (int var55 : (int[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.l6(var55);
               }
            }
            break;
         case 10:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 4);
            } else {
               for (long var62 : (long[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.n5(var62);
               }
            }
            break;
         case 11:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 8);
            } else {
               for (long var61 : (long[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.l6(var61);
               }
            }
            break;
         case 12:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 8);
            } else {
               for (long var60 : (long[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.k5(var60);
               }
            }
            break;
         case 13:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 4);
            } else {
               for (float var54 : (float[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.n5(var54);
               }
            }
            break;
         case 14:
            if (var4.a6() > 2) {
               this.n5(var1, var4, 8);
            } else {
               for (double var10 : (double[])com.aspose.slides.ms.System.u3.n5(var4)) {
                  var1.n5(var10);
               }
            }
            break;
         case 15:
            for (com.aspose.slides.ms.System.c4 var53 : (com.aspose.slides.ms.System.c4[])com.aspose.slides.ms.System.u3.n5(var4)) {
               var1.n5(var53);
            }
            break;
         case 16:
            for (j5 var52 : (j5[])com.aspose.slides.ms.System.u3.n5(var4)) {
               var1.l6(var52.z8());
            }
            break;
         case 17:
         default:
            if (var5 != com.aspose.slides.internal.v6g.k5.n5(s4.class)) {
               throw new NotSupportedException(d1.n5(new String[]{"Unsupported primitive type: ", var5.q0()}));
            }

            for (s4 var51 : (s4[])com.aspose.slides.ms.System.u3.n5(var4)) {
               var1.l6(var51.a6());
            }
            break;
         case 18:
            for (String var9 : (String[])com.aspose.slides.ms.System.u3.n5(var4)) {
               var1.n5(var9);
            }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.ms.System.u3 var2, int var3) {
      int var4 = com.aspose.slides.ms.System.y4.n5(var2);
      if (this.n3 == null || var4 > this.n3.length && this.n3.length != this.y4) {
         this.n3 = new byte[var4 <= this.y4 ? var4 : this.y4];
      }

      int var5 = 0;

      while (var4 > 0) {
         int var6 = var4 < this.n3.length ? var4 : this.n3.length;
         com.aspose.slides.ms.System.y4.n5(var2, var5, com.aspose.slides.ms.System.u3.n5((Object)(this.n3)), 0, var6);
         var1.n5(this.n3, 0, var6);
         var4 -= var6;
         var5 += var6;
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.ms.System.u3 var2, y8 var3) {
      int var4 = 0;

      for (Object var6 : var2) {
         if (var6 != null && var4 > 0) {
            this.n5(var1, var4);
            this.n5(var1, var3, var6);
            var4 = 0;
         } else if (var6 == null) {
            var4++;
         } else {
            this.n5(var1, var3, var6);
         }
      }

      if (var4 > 0) {
         this.n5(var1, var4);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, int var2) {
      if (var2 == 1) {
         var1.n5((byte)10);
      } else if (var2 == 2) {
         var1.n5((byte)10);
         var1.n5((byte)10);
      } else if (var2 <= 255) {
         var1.n5((byte)13);
         var1.n5((byte)var2);
      } else {
         var1.n5((byte)14);
         var1.l6(var2);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, long var2) {
      var1.n5((byte)9);
      var1.l6((int)var2);
   }

   public void n5(com.aspose.slides.internal.z0k.l6 var1, y8 var2, Object var3) {
      if (var3 == null) {
         com.aspose.slides.internal.u6p.n5.n5(var2, this.c8, this.t2.k5());
         var1.n5((byte)10);
      } else if (com.aspose.slides.internal.u6p.n5.n5(j8.n5(var3))) {
         if (!com.aspose.slides.internal.u6p.n5.n5(var2)) {
            var1.n5((byte)8);
            this.l6(var1, j8.n5(var3));
         }

         n5(var1, var3);
      } else if (var2.y1()) {
         this.n5(var1, var3, true);
      } else if (var3 instanceof String) {
         boolean var4 = false;
         boolean[] var5 = new boolean[]{false};
         long var6 = this.u3.n5(var3, var5);
         var4 = var5[0];
         if (var4) {
            this.n5(var1, var3, false);
         } else {
            this.n5(var1, var6);
         }
      } else {
         if (var3.getClass().isArray()) {
            var3 = com.aspose.slides.ms.System.u3.n5(var3, 1, true);
         }

         boolean var9 = false;
         boolean[] var11 = new boolean[]{false};
         long var12 = this.u3.n5(var3, var11);
         var9 = var11[0];
         if (var9) {
            this.u9.enqueue(var3);
         }

         this.n5(var1, var12);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, long var2, String var4) {
      var1.n5((byte)6);
      var1.l6((int)var2);
      var1.n5(var4);
   }

   public int n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.p4l.n5 var2) {
      return this.n5(var1, var2.l6());
   }

   public int n5(com.aspose.slides.internal.z0k.l6 var1, String var2) {
      if (d1.a6(var2, k5)) {
         return -1;
      }

      boolean var3 = false;
      boolean[] var4 = new boolean[]{false};
      int var5 = this.n5(var2, var4);
      var3 = var4[0];
      if (!var3) {
         return var5;
      }

      var1.n5((byte)12);
      var1.l6(var5);
      if (this.s7 == 1) {
         var1.n5(var2);
      } else {
         int var6 = d1.u3(var2, ',');
         if (var6 != -1) {
            var2 = d1.l6(var2, 0, var6);
         }

         var1.n5(var2);
      }

      return var5;
   }

   public int n5(com.aspose.slides.internal.p4l.n5 var1) {
      return this.n5(var1.l6());
   }

   public int n5(String var1) {
      return (Integer)this.h0.get_Item(var1);
   }

   private int n5(String var1, boolean[] var2) {
      if (this.h0.containsKey(var1)) {
         var2[0] = false;
         return (Integer)this.h0.get_Item(var1);
      } else {
         int var3 = (int)this.u3.n5(0, var2);
         this.h0.addItem(var1, var3);
         return var3;
      }
   }

   public static void n5(com.aspose.slides.internal.z0k.l6 var0, Object var1) {
      y8 var2 = j8.n5(var1);
      switch (y8.u3(var2)) {
         case 3:
            var0.l6((Boolean)var1);
            break;
         case 4:
            var0.n5((Character)var1);
            break;
         case 5:
            var0.n5((Byte)var1);
            break;
         case 6:
            var0.n5((Byte)var1);
            break;
         case 7:
            var0.n5((Short)var1);
            break;
         case 8:
            var0.n5((Integer)var1);
            break;
         case 9:
            var0.l6((Integer)var1);
            break;
         case 10:
            var0.n5((Long)var1);
            break;
         case 11:
            var0.l6((Long)var1);
            break;
         case 12:
            var0.k5((Long)var1);
            break;
         case 13:
            var0.n5((Float)var1);
            break;
         case 14:
            var0.n5((Double)var1);
            break;
         case 15:
            var0.n5(((com.aspose.slides.ms.System.c4)var1).t9(com.aspose.slides.internal.x7n.l6.k5()));
            break;
         case 16:
            var0.l6(((j5)var1).z8());
            break;
         case 17:
         default:
            if (var2 != com.aspose.slides.internal.v6g.k5.n5(s4.class)) {
               throw new NotSupportedException(d1.n5(new String[]{"Unsupported primitive type: ", j8.n5(var1).q0()}));
            }

            var0.l6(((s4)var1).a6());
            break;
         case 18:
            var0.n5((String)var1);
      }
   }

   public static void n5(com.aspose.slides.internal.z0k.l6 var0, y8 var1) {
      var0.n5(n5(var1));
   }

   public static byte n5(y8 var0) {
      if (var0 == com.aspose.slides.internal.v6g.k5.n5(String.class)) {
         return 1;
      } else if (com.aspose.slides.internal.u6p.n5.n5(var0)) {
         return 0;
      } else if (var0 == com.aspose.slides.internal.v6g.k5.n5(Object.class)) {
         return 2;
      } else if (var0.s3() && var0.c8() == 1 && var0.h0() == com.aspose.slides.internal.v6g.k5.n5(Object.class)) {
         return 5;
      } else if (var0.s3() && var0.c8() == 1 && var0.h0() == com.aspose.slides.internal.v6g.k5.n5(String.class)) {
         return 6;
      } else if (var0.s3() && var0.c8() == 1 && com.aspose.slides.internal.u6p.n5.n5(var0.h0())) {
         return 7;
      } else {
         return (byte)(var0.t4() == l6 ? 3 : 4);
      }
   }

   public void l6(com.aspose.slides.internal.z0k.l6 var1, y8 var2) {
      switch (n5(var2)) {
         case 0:
            var1.n5(com.aspose.slides.internal.u6p.n5.l6(var2));
         case 1:
         case 2:
         case 5:
         case 6:
         default:
            break;
         case 3:
            String var3 = var2.q0();
            var1.n5(var3);
            break;
         case 4:
            var1.n5(var2.q0());
            var1.l6(this.n5(var2.t4()));
            break;
         case 7:
            var1.n5(com.aspose.slides.internal.u6p.n5.l6(var2.h0()));
      }
   }
}
