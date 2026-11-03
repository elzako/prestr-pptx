package com.aspose.slides.internal.z4;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class s3 {
   private com.aspose.slides.internal.z0k.t4 n5;
   private com.aspose.slides.internal.d0.k5 l6;

   public s3(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      this.n5 = var1;
      this.l6 = null;
   }

   public final com.aspose.slides.internal.z0k.t4 u3() {
      return this.n5;
   }

   public final void a6() {
      this.n5.close();
   }

   public final void n5(byte var1) {
      this.n5.writeByte(var1);
   }

   public final void n5(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         this.n5.writeByte((byte)var1.charAt(var2));
      }
   }

   public final void n5(String var1, String var2) {
      this.n5(d1.n5(var1, new Object[]{var2}));
   }

   public final void n5(String var1, String var2, String var3) {
      this.n5(d1.n5(var1,new Object[]{ var2, var3}));
   }

   public final void n5(String var1, String var2, String var3, String var4) {
      this.n5(d1.n5(var1,new Object[]{ var2, var3, var4}));
   }

   public final void n5(byte[] var1, int var2, int var3) {
      this.n5.write(var1, var2, var3);
   }

   public final void l6(String var1) {
      this.n5(var1);
      this.u9();
   }

   public final void u9() {
      this.n5(" ");
   }

   public final void n5(float var1) {
      this.n5(l6(var1));
   }

   public final void h0() {
      this.n5("\r\n");
   }

   public final void k5(String var1) {
      this.n5(var1);
      this.h0();
   }

   public final void l6(String var1, String var2) {
      this.k5(d1.n5(var1, new Object[]{var2}));
   }

   public final void l6(String var1, String var2, String var3) {
      this.k5(d1.n5(var1,new Object[]{ var2, var3}));
   }

   public final void c8() {
      this.n5("<<");
   }

   public final void t2() {
      this.n5(">>");
   }

   public final void k5(String var1, String var2) {
      if (com.aspose.slides.internal.n2d.t4.l6(var2)) {
         this.n5(var1);
         this.u9();
         this.n5(var2);
      }
   }

   public final void n5(String var1, boolean var2) {
      this.k5(var1, n5(var2));
   }

   private static String n5(boolean var0) {
      return var0 ? "true" : "false";
   }

   public final void n5(String var1, boolean[] var2) {
      this.n5(var1);
      this.u9();
      this.n5(var2);
   }

   public final void n5(String var1, float[] var2) {
      this.n5(var1);
      this.u9();
      this.n5(var2);
   }

   public final void n5(String var1, int[] var2) {
      this.n5(var1);
      this.u9();
      this.n5(var2);
   }

   public final void u3(String var1, String var2) {
      if (com.aspose.slides.internal.n2d.t4.l6(var2)) {
         this.n5(var1);
         this.u3(var2);
      }
   }

   public final void n5(String var1, String var2, boolean var3) {
      if (com.aspose.slides.internal.n2d.t4.l6(var2)) {
         this.n5(var1);
         if (this.l6 != null) {
            byte[] var4 = new byte[var2.length()];
            com.aspose.slides.internal.l7h.j5.e2().n5(var2, 0, var2.length(), var4, 0);
            byte[] var5 = this.l6.n5(var4);
            this.n5("<");
            this.n5(com.aspose.slides.internal.n2d.t4.n5(var5));
            this.n5(">");
         } else {
            this.n5("(");
            if (var3) {
               this.a6(var2);
            } else {
               this.n5(var2);
            }

            this.n5(")");
         }
      }
   }

   public final void u3(String var1) {
      if (this.l6 != null) {
         int var2 = var1.length() * 2 + 2;
         byte[] var3 = new byte[var2];
         var3[0] = -2;
         var3[1] = -1;
         com.aspose.slides.internal.l7h.j5.t4().n5(var1, 0, var1.length(), var3, 2);
         byte[] var4 = this.l6.n5(var3);
         this.n5("<");
         this.n5(com.aspose.slides.internal.n2d.t4.n5(var4));
         this.n5(">");
      } else {
         this.n5("(");
         this.n5((byte)-2);
         this.n5((byte)-1);

         for (int var5 = 0; var5 < var1.length(); var5++) {
            char var6 = var1.charAt(var5);
            this.n5(var6);
         }

         this.n5(")");
      }
   }

   public final void n5(String var1, com.aspose.slides.internal.o9b.y1 var2) {
      this.n5(var1);
      this.u9();
      this.n5("[");
      this.n5(var2.a6());
      this.u9();
      this.n5(var2.t2());
      this.u9();
      this.n5(var2.h0());
      this.u9();
      this.n5(var2.l6());
      this.n5("]");
   }

   public final void n5(String var1, com.aspose.slides.ms.System.j5 var2) {
      if (!com.aspose.slides.ms.System.j5.h0(var2, com.aspose.slides.ms.System.j5.l6)) {
         String var3 = d1.n5("D:{0}", new Object[]{com.aspose.slides.internal.t6j.u3.l6(var2.m3())});
         this.n5(var1, var3, true);
      }
   }

   public final void n5(String var1, int var2) {
      this.k5(var1, com.aspose.slides.internal.t6j.u3.n5(var2));
   }

   public final void n5(String var1, float var2) {
      this.k5(var1, l6(var2));
   }

   public final void n5(String var1, com.aspose.slides.internal.w0.c8 var2) {
      this.n5(var1);
      this.u9();
      this.n5("[");
      this.n5(var2);
      this.n5("]");
   }

   public final void a6(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         this.l6((byte)var1.charAt(var2));
      }
   }

   public final void n5(int var1) {
      this.l6((byte)(var1 >> 8));
      this.l6((byte)var1);
   }

   public final void l6(byte var1) {
      switch (var1) {
         case 13:
            this.n5("\\015");
            break;
         case 40:
         case 41:
         case 92:
            this.n5((byte)92);
            this.n5(var1);
            break;
         default:
            this.n5(var1);
      }
   }

   public final void n5(boolean[] var1) {
      this.n5("[");

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5(n5(var1[var2]));
         if (var2 < var1.length - 1) {
            this.u9();
         }
      }

      this.n5("]");
   }

   public final void n5(float[] var1) {
      this.n5("[");

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5(var1[var2]);
         if (var2 < var1.length - 1) {
            this.u9();
         }
      }

      this.n5("]");
   }

   public final void n5(int[] var1) {
      this.n5("[");

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5(com.aspose.slides.internal.t6j.u3.n5(var1[var2]));
         if (var2 < var1.length - 1) {
            this.u9();
         }
      }

      this.n5("]");
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.n5(var1.u3());
      this.u9();
      this.n5(var1.a6());
      this.u9();
      this.n5(var1.u9());
      this.u9();
      this.n5(var1.h0());
      this.u9();
      this.n5(var1.c8());
      this.u9();
      this.n5(var1.t2());
   }

   public final void n5(com.aspose.slides.internal.d0.k5 var1) {
      this.l6 = var1;
   }

   public static String n5(com.aspose.slides.internal.p1s.n5 var0) {
      return d1.n5("{0} {1} {2}",new Object[]{ l6(var0.k5() / 255.0F), l6(var0.u3() / 255.0F), l6(var0.a6() / 255.0F)});
   }

   public static String l6(float var0) {
      return com.aspose.slides.internal.t6j.u3.l6(var0);
   }

   public static int n5(float var0, float var1) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.n5(q1.n5(var0), q1.n5(var1)) / 32767.0F, 13) + 1;
   }

   protected void s7() {
      this.n5 = null;
   }
}
