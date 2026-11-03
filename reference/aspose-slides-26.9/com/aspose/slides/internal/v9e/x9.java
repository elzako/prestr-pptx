package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.ms.System.Xml.z9;

public final class x9 {
   private int n5;
   private x9 l6;
   private y0 k5;
   private z9 u3;
   private a5 a6;
   private v0 u9;
   private s7 h0 = new s7();
   private ArrayList c8 = new ArrayList();
   private int t2;
   private ArrayList s7 = new ArrayList();
   private int x8;
   private s7 n3 = new s7();
   private s7 y4;
   private boolean e2;
   private int t9;
   private int z1;

   public x9(y0 var1, z9 var2) {
      this.k5 = var1;
      this.u3 = var2 != null ? var2 : new com.aspose.slides.ms.System.Xml.j9();
      this.a6 = new a5(this.u3);
      this.u9 = new v0(this.u3, this.a6);
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final x9 l6() {
      return this.l6;
   }

   public final void n5(x9 var1) {
      this.l6 = var1;
   }

   public final y0 k5() {
      return this.k5;
   }

   public final s7 u3() {
      return this.h0;
   }

   public final ArrayList a6() {
      return this.c8;
   }

   public final int u9() {
      return this.t2;
   }

   private void n5(String var1, boolean var2) {
      this.y4.n5(var1, var2);
   }

   private boolean l6(int var1) {
      if (this.t9 != 0 && (var1 & 8192) != 0) {
         this.t9 = 2;
         this.q0();
         this.h0(var1);
         return this.k5.n5(this) == 0;
      } else {
         return true;
      }
   }

   public final int n5(int var1, int var2, String var3, String var4, String var5, boolean var6, Object var7, boolean var8) {
      if (!this.l6(var1)) {
         return 2;
      }

      this.k5(var1);
      this.u3(var1);
      this.n3();
      var3 = var3 != null ? this.u3.n5(var3) : this.a6.n5();
      var4 = var4 != null ? this.u3.n5(var4) : this.a6.n5();
      var5 = var5 != null ? this.u3.n5(var5) : this.a6.n5();
      switch (var2) {
         case 0:
         case 4:
         case 5:
         case 6:
         case 9:
         default:
            break;
         case 1:
            this.h0.u3 = com.aspose.slides.internal.v6g.k5.n5(var7, d2.class);
            this.h0.k5 = var8;
            this.n5(var3, var4, var5, var6);
            break;
         case 2:
            this.n5(var3, var4, var5, var7, var8);
            break;
         case 3:
            this.n5(var4, var5);
            break;
         case 7:
            if (!this.n5(var3, var4, var5)) {
               return 3;
            }
            break;
         case 8:
            this.x8();
      }

      return this.a6(var1);
   }

   public final int n5(int var1, String var2, boolean var3) {
      if (!this.l6(var1)) {
         return 2;
      }

      this.k5(var1);
      this.u3(var1);
      this.n3();
      if ((var1 & 8192) != 0) {
         this.y4.l6(this.z1);
         this.y4.n5(3);
      }

      this.n5(var2, var3);
      return this.a6(var1);
   }

   public final int n5(int var1, int var2) {
      if (!this.l6(var1)) {
         return 2;
      }

      this.k5(var1);
      this.n3();
      this.e2 = (var1 & 65536) != 0;
      if ((var1 & 4096) != 0 && this.h0.h0()) {
         return 0;
      }

      this.u3(var1);
      if ((var1 & 8192) != 0 && var2 == 1) {
         this.t2();
      }

      return this.u9(var1);
   }

   public final void h0() {
      if (this.t9 == 2) {
         this.t9 = 0;
      }
   }

   public final void c8() {
      if (this.t9 == 1) {
         this.t9 = 2;
         this.q0();
         this.k5.n5(this);
      }

      this.k5.l6();
   }

   private int n5(String var1, String var2, String[] var3) {
      for (int var4 = 0; var4 < this.t2; var4++) {
         s7 var5 = (s7)this.c8.get_Item(var4);
         if (com.aspose.slides.ms.System.Xml.v8.n5(var5.n5(), var1)) {
            if (com.aspose.slides.ms.System.Xml.v8.n5(var5.l6(), var2)) {
               return var4;
            }

            if (com.aspose.slides.ms.System.Xml.v8.n5(var5.k5(), var3[0])) {
               var3[0] = com.aspose.slides.ms.System.d1.n5;
            }
         }
      }

      return -1;
   }

   private void n5(String var1, String var2, String var3, boolean var4) {
      this.y4.n5(1);
      this.y4.k5(var1);
      this.y4.n5(var2);
      this.y4.l6(var3);
      this.y4.l6(this.z1);
      this.y4.n5(var4);
      this.u9.n5(var2, var3, var1);
   }

   private void t2() {
      h2 var1 = this.u9.l6();
      this.y4.n5(15);
      this.y4.k5(var1.u3());
      this.y4.n5(var1.l6());
      this.y4.l6(var1.k5());
      this.y4.l6(this.z1);
   }

   private int s7() {
      if (this.t2 >= this.c8.size()) {
         this.c8.addItem(new s7());
      }

      return this.t2++;
   }

   private void n5(String var1, String var2, String var3, Object var4, boolean var5) {
      String[] var6 = new String[]{var1};
      int var7 = this.n5(var2, var3, var6);
      var1 = var6[0];
      if (var7 == -1) {
         var7 = this.s7();
      }

      s7 var8 = (s7)this.c8.get_Item(var7);
      var8.n5(var1, var2, var3);
      var8.l6(this.z1);
      var8.n5(2);
      var8.a6 = com.aspose.slides.internal.v6g.k5.n5(var4, a0.class);
      var8.k5 = var5;
      this.y4 = var8;
   }

   private void n5(String var1, String var2) {
      boolean var3 = false;
      if (com.aspose.slides.ms.System.Xml.v8.n5(var1, this.a6.n5())) {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, this.u9.n5()) && !com.aspose.slides.ms.System.Xml.v8.n5(this.h0.l6(), this.a6.n5())) {
            this.l6(var2, var1);
         }
      } else {
         boolean[] var4 = new boolean[]{false};
         String var5 = this.u9.n5(var1, var4);
         var3 = var4[0];
         if (var5 != null) {
            if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var5) && !var3) {
               this.l6(var2, var1);
            }
         } else {
            this.l6(var2, var1);
         }
      }

      this.y4 = this.n3;
      this.y4.n5(2);
   }

   private boolean n5(String var1, String var2, String var3) {
      this.y4.n5(7);
      this.y4.k5(var1);
      this.y4.n5(var2);
      this.y4.l6(var3);
      this.y4.l6(this.z1);
      return true;
   }

   private void x8() {
      this.y4.n5(8);
      this.y4.l6(this.z1);
   }

   private void k5(int var1) {
      switch (var1 & 768) {
         case 256:
            this.z1++;
            break;
         case 512:
            this.z1--;
      }
   }

   private void u3(int var1) {
      if ((var1 & 8192) != 0) {
         this.t2 = 0;
         this.x8 = 0;
         this.y4 = this.h0;
         this.y4.n5(this.a6.n5(), this.a6.n5(), this.a6.n5());
         this.y4.n5(0);
         this.y4.n5(false);
         this.y4.u3 = null;
         this.y4.a6 = null;
      }
   }

   private void n3() {
      if (this.e2) {
         this.u9.k5();
         this.e2 = false;
      }
   }

   private int a6(int var1) {
      if ((var1 & 16384) != 0) {
         this.t9 = 2;
         this.q0();
         this.h0(var1);
         return this.k5.n5(this);
      } else {
         this.t9 = 1;
         return 0;
      }
   }

   private int u9(int var1) {
      if ((var1 & 16384) != 0) {
         this.t9 = 2;
         this.q0();
         this.h0(var1);
         return this.k5.n5(this);
      } else {
         return 0;
      }
   }

   private void h0(int var1) {
      if ((var1 & 1024) != 0) {
         this.h0.n5(false);
      }
   }

   private void y4() {
      for (int var1 = 0; var1 < this.t2; var1++) {
         s7 var2 = (s7)this.c8.get_Item(var1);
         if (com.aspose.slides.ms.System.Xml.v8.n5(var2.k5(), this.a6.a6())) {
            h2 var3 = this.u9.l6();
            if (com.aspose.slides.ms.System.Xml.v8.n5(var2.n5(), this.a6.l6())) {
               var3.u3(var2.u3());
            } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2.n5(), this.a6.k5())) {
               var3.n5(k5(var2.u3()));
            }
         }
      }
   }

   private void e2() {
      if (com.aspose.slides.ms.System.Xml.v8.n5(this.h0.l6(), this.a6.n5())) {
         this.h0.k5(this.a6.n5());
      }

      if (com.aspose.slides.ms.System.Xml.v8.n5(this.h0.k5(), this.a6.n5())) {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(this.h0.l6(), this.u9.n5())) {
            this.l6(this.h0.l6(), this.h0.k5());
         }
      } else {
         boolean var1 = false;
         boolean[] var2 = new boolean[]{false};
         String var3 = this.u9.n5(this.h0.k5(), var2);
         var1 = var2[0];
         if (var3 != null) {
            if (!com.aspose.slides.ms.System.Xml.v8.n5(this.h0.l6(), var3)) {
               if (var1) {
                  this.h0.k5(this.n5(this.h0.l6()));
               } else {
                  this.l6(this.h0.l6(), this.h0.k5());
               }
            }
         } else {
            this.l6(this.h0.l6(), this.h0.k5());
         }
      }

      h2 var5 = this.u9.l6();
      var5.k5(this.h0.k5());
   }

   private void c8(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         s7 var3 = (s7)this.c8.get_Item(var2);
         if (com.aspose.slides.ms.System.Xml.v8.n5(var3.l6(), this.a6.n5())) {
            var3.k5(this.a6.n5());
         } else if (com.aspose.slides.ms.System.Xml.v8.n5(var3.k5(), this.a6.n5())) {
            var3.k5(this.n5(var3.l6()));
         } else {
            boolean var4 = false;
            boolean[] var5 = new boolean[]{false};
            String var6 = this.u9.n5(var3.k5(), var5);
            var4 = var5[0];
            if (var6 != null) {
               if (!com.aspose.slides.ms.System.Xml.v8.n5(var3.l6(), var6)) {
                  if (var4) {
                     var3.k5(this.n5(var3.l6()));
                  } else {
                     this.l6(var3.l6(), var3.k5());
                  }
               }
            } else {
               this.l6(var3.l6(), var3.k5());
            }
         }
      }
   }

   private void t9() {
      for (int var1 = this.x8 - 1; var1 >= 0; var1--) {
         s7 var2 = (s7)this.c8.get_Item(this.s7());
         var2.n5((s7)this.s7.get_Item(var1));
      }
   }

   private void z1() {
      com.aspose.slides.internal.l7h.a5 var1 = null;
      String var2 = this.h0.u3();
      boolean var3 = false;
      int var4 = 0;
      int var5 = 0;

      while (var4 < var2.length()) {
         switch (var2.charAt(var4)) {
            case '-':
               if (var3) {
                  if (var1 == null) {
                     var1 = new com.aspose.slides.internal.l7h.a5(var2, var5, var4, 2 * var2.length());
                  } else {
                     var1.n5(var2, var5, var4 - var5);
                  }

                  var1.n5(" -");
                  var5 = var4 + 1;
               }

               var3 = true;
               break;
            default:
               var3 = false;
         }

         var4++;
      }

      if (var1 != null) {
         if (var5 < var2.length()) {
            var1.n5(var2, var5, var2.length() - var5);
         }

         if (var3) {
            var1.n5(" ");
         }

         this.h0.u3(var1.toString());
      } else if (var3) {
         this.h0.n5(" ", false);
      }
   }

   private void t4() {
      com.aspose.slides.internal.l7h.a5 var1 = null;
      String var2 = this.h0.u3();
      boolean var3 = false;
      int var4 = 0;
      int var5 = 0;

      while (var4 < var2.length()) {
         switch (var2.charAt(var4)) {
            case '>':
               if (var3) {
                  if (var1 == null) {
                     var1 = new com.aspose.slides.internal.l7h.a5(var2, var5, var4, 2 * var2.length());
                  } else {
                     var1.n5(var2, var5, var4 - var5);
                  }

                  var1.n5(" >");
                  var5 = var4 + 1;
               }

               var3 = false;
               break;
            case '?':
               var3 = true;
               break;
            default:
               var3 = false;
         }

         var4++;
      }

      if (var1 != null) {
         if (var5 < var2.length()) {
            var1.n5(var2, var5, var2.length() - var5);
         }

         this.h0.u3(var1.toString());
      }
   }

   private void q0() {
      switch (this.h0.a6()) {
         case 1:
            int var1 = this.t2;
            this.e2();
            this.c8(var1);
            this.y4();
            this.t9();
            break;
         case 7:
            this.t4();
            break;
         case 8:
            this.z1();
      }
   }

   private int z3() {
      if (this.x8 >= this.s7.size()) {
         this.s7.addItem(new s7());
      }

      return this.x8++;
   }

   private void l6(String var1, String var2) {
      int var3 = this.z3();
      s7 var4 = (s7)this.s7.get_Item(var3);
      if (com.aspose.slides.ms.System.d1.a6(var2, this.a6.n5())) {
         var4.n5(this.a6.n5(), this.a6.u3(), this.a6.h0());
      } else {
         var4.n5(this.a6.u3(), var2, this.a6.h0());
      }

      var4.l6(this.z1);
      var4.n5(2);
      var4.u3(var1);
      this.u9.n5(var2, var1);
   }

   private String l6(String var1) {
      String var2 = this.u9.l6("xp_{0}");
      this.l6(var1, var2);
      return var2;
   }

   public final String n5(String var1) {
      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = this.u9.n5(var1, var3);
      var2 = var3[0];
      return var4 ? var2 : this.l6(var1);
   }

   private static int k5(String var0) {
      if ("default".equals(var0)) {
         return 1;
      } else {
         return "preserve".equals(var0) ? 2 : 0;
      }
   }
}
