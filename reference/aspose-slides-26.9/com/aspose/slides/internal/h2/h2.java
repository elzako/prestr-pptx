package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public abstract class h2 {
   public int n5;
   private boolean h0 = true;
   private Dictionary<String, a5> c8 = null;
   private Dictionary<String, String> t2 = null;
   protected String l6 = null;
   protected boolean k5 = false;
   public boolean u3 = false;
   private int s7 = -1;
   private h2[] x8 = null;
   private s3 n3;
   protected a5 a6;
   protected z3 u9;

   public final int l6() {
      return this.n5;
   }

   public h2(int var1) {
      this.n5 = var1;
   }

   public void n5(h2 var1) {
      this.k5 = var1.k5;
      this.h0 = var1.h0;
      this.l6 = var1.l6;
      this.s7 = var1.s7;
      if (var1.x8 != null) {
         this.x8 = new h2[var1.x8.length];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1.x8)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), 0, this.x8.length);
      }

      if (var1.c8 != null) {
         this.c8 = new Dictionary<>(var1.c8);
      }

      if (var1.t2 != null) {
         this.t2 = new Dictionary<>(var1.t2);
      }
   }

   public final void n5(boolean var1) {
      this.h0 = var1;
   }

   public final void n5(String var1, String var2) {
      if (this.t2 == null) {
         this.t2 = new Dictionary<>();
      }

      this.t2.set_Item(var1, var2);
   }

   public final void n5(String var1, a5 var2) {
      if (this.c8 == null) {
         this.c8 = new Dictionary<>();
      }

      this.c8.set_Item(var1, var2);
   }

   public void l6(h2 var1) {
      throw new Exception(d1.n5(new String[]{"Unable to add subproperties ", j8.n5(this).s7()}));
   }

   public h2 a_(int var1) {
      throw new Exception("Unable to add subproperties");
   }

   public final void k5(h2 var1) {
      if (this.x8 == null) {
         this.x8 = new h2[3];
      }

      for (int var2 = 0; var2 < this.x8.length; var2++) {
         if (this.x8[var2] == null) {
            this.x8[var2] = var1;
            break;
         }
      }
   }

   public final void n5(s3 var1) {
      this.n3 = var1;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final void n5(String var1, boolean var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public final void l6(int var1) {
      this.s7 = var1;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public final void n5(z3 var1) {
      this.u9 = var1;
   }

   public a5 n5() {
      return null;
   }

   public final a5 n5(com.aspose.slides.internal.e5.w1 var1, boolean var2) {
      a5 var3 = null;
      if (this.u9 != null && this.u9.n5(var1)) {
         var3 = this.u9.l6(var1);
      } else {
         var3 = var1.l6(this.n5);
         if (var3 == null) {
            var3 = this.a6(var1);
         }

         if (var3 == null) {
            var3 = this.u3(var1);
         }
      }

      if (var3 == null && var2) {
         com.aspose.slides.internal.e5.w1 var4 = var1.k5();
         if (var4 != null && this.k5()) {
            var3 = var4.n5(this.n5, true, false);
         }
      }

      return var3;
   }

   public a5 n5(int var1, com.aspose.slides.internal.e5.w1 var2, boolean var3, boolean var4) {
      a5 var5 = this.n5(var2, var3);
      if (var5 == null && var4) {
         var5 = this.n5(var2);
      }

      return var5;
   }

   public final boolean k5() {
      return this.h0;
   }

   public com.aspose.slides.internal.f2.a6 l6(com.aspose.slides.internal.e5.w1 var1) {
      return this.s7 == -1 ? null : new com.aspose.slides.internal.f2.h0(var1, this.s7);
   }

   public final a5 n5(a5 var1, int var2) {
      com.aspose.slides.internal.f2.l6 var3 = (com.aspose.slides.internal.f2.l6)var1.g_();
      return var3.n5(var2);
   }

   public a5 n5(a5 var1, int var2, a5 var3) {
      com.aspose.slides.internal.f2.l6 var4 = (com.aspose.slides.internal.f2.l6)var1.g_();
      var4.n5(var2, var3, false);
      return var1;
   }

   public a5 n5(com.aspose.slides.internal.e5.w1 var1) {
      if (this.a6 != null) {
         return this.a6;
      }

      a5 var2 = this.n5(var1, this.l6, var1.l6());
      if (!this.k5) {
         this.a6 = var2;
      }

      return var2;
   }

   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      try {
         a5 var4 = null;
         String var5 = var2;
         if (d1.a6(var2, "inherit")) {
            var4 = var1.h0(this.n5 & 511);
            if ((this.n5 & -512) != 0) {
               var4 = this.n5(var4, this.n5 & -512);
            }
         } else {
            var5 = this.k5(d1.l6(var5));
            var4 = this.n5(var5);
         }

         if (var4 == null) {
            var4 = com.aspose.slides.internal.b3.w1.n5(var5, new com.aspose.slides.internal.b3.j5(this, var1));
         }

         if (var4 != null) {
            var4 = this.l6(var4, var1, var3);
         }

         if (var4 == null) {
            throw new com.aspose.slides.internal.b3.z8(d1.n5(new String[]{"No conversion defined ", var5}));
         } else {
            return var4;
         }
      } catch (com.aspose.slides.internal.b3.z8 var6) {
         if (var3 != null) {
            var6.n5(var3.m_());
         }

         var6.n5(this.u3());
         throw var6;
      }
   }

   public a5 n5(a5 var1, int var2, com.aspose.slides.internal.e5.w1 var3, String var4, com.aspose.slides.internal.e5.t9 var5) {
      return var1;
   }

   public final a5 n5(com.aspose.slides.internal.e5.w1 var1, a5 var2, com.aspose.slides.internal.e5.t9 var3) {
      a5 var4 = this.l6(var2, var1, var3);
      if (var4 == null) {
         String var5 = var2.i_();
         if (var5 != null) {
            var4 = this.n5(var5);
            if (var4 == null) {
               String var6 = this.k5(var5);
               if (!d1.a6(var6, var5)) {
                  a5 var7 = com.aspose.slides.internal.b3.w1.n5(var6, new com.aspose.slides.internal.b3.j5(this, var1));
                  var4 = this.l6(var7, var1, var3);
               }
            }
         }
      }

      return var4;
   }

   public a5 n5(String var1) {
      return this.c8 != null && this.c8.containsKey(var1) ? this.c8.get_Item(var1) : null;
   }

   public final String k5(String var1) {
      if (this.t2 != null && this.t2.containsKey(var1)) {
         String var2 = this.t2.get_Item(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return var1;
   }

   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      return null;
   }

   protected a5 n5(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      return null;
   }

   protected a5 u3(com.aspose.slides.internal.e5.w1 var1) {
      return this.u9 != null ? this.u9.l6(var1) : null;
   }

   public final a5 a6(com.aspose.slides.internal.e5.w1 var1) {
      if (this.x8 == null) {
         return null;
      }

      int var2 = this.x8.length;

      for (int var3 = 0; var3 < var2 && this.x8[var3] != null; var3++) {
         h2 var4 = this.x8[var3];
         a5 var5 = var1.l6(var4.n5);
         if (var5 != null) {
            s3 var6 = var4.n3;
            a5 var7 = var6.l6(this.l6(), var5, this, var1);
            if (var7 != null) {
               return var7;
            }
         }
      }

      return null;
   }

   public final String u3() {
      return com.aspose.slides.internal.e5.s7.n5(this.n5);
   }

   @Override
   public final Object clone() {
      return this.a6();
   }

   protected Object a6() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
