package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;

public class b9 extends i0 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private String a6;
   private l0 u9;
   private int h0;
   private l0 c8;
   private boolean t2;
   private boolean s7;
   private int x8;
   private com.aspose.slides.ms.System.u8 n3;

   private b9(l0 var1) {
      this.u9 = var1;
      this.h0 = -1;
      this.c8 = this.u9;
      this.l6 = 0;
      this.t2 = false;
      this.s7 = true;
      this.x8 = -1;
      this.n3 = new com.aspose.slides.ms.System.u8(new r5(var1.getDocument(), this));
   }

   @Override
   protected void finalize() throws Throwable {
      try {
         this.n5(false);
      } finally {
         super.finalize();
      }
   }

   public final void n5(p9 var1) {
      if (!this.s7) {
         z9 var2 = this.u9.getDocument().getNameTable();
         this.u3 = var2.n5(this.u3);
         this.a6 = var2.n5(this.a6);
         this.s7 = true;
      }

      if (this.u3(var1.l6())) {
         this.l6++;
         this.h0 = -1;
         this.c8 = this.u9;
         if (var1.n5() == 0) {
            this.t2 = false;
         }
      }

      this.x8 = -1;
   }

   public b9(l0 var1, String var2) {
      this(var1);
      z9 var3 = var1.getDocument().getNameTable();
      this.n5 = var3.n5("*");
      this.k5 = var3.n5(var2);
      this.u3 = null;
      this.a6 = null;
   }

   public b9(l0 var1, String var2, String var3) {
      this(var1);
      z9 var4 = var1.getDocument().getNameTable();
      this.n5 = var4.n5("*");
      this.u3 = var4.l6(var2);
      this.a6 = var4.l6(var3);
      if (this.u3 == null || this.a6 == null) {
         this.t2 = true;
         this.s7 = false;
         this.u3 = var2;
         this.a6 = var3;
      }

      this.k5 = null;
   }

   public final int l6() {
      return this.l6;
   }

   private l0 l6(l0 var1) {
      l0 var2 = var1.getFirstChild();
      if (var2 == null) {
         var2 = var1;

         while (var2 != null && var2 != this.u9 && var2.getNextSibling() == null) {
            var2 = var2.getParentNode();
         }

         if (var2 != null && var2 != this.u9) {
            var2 = var2.getNextSibling();
         }
      }

      if (var2 == this.u9) {
         var2 = null;
      }

      return var2;
   }

   private l0 k5(l0 var1) {
      l0 var2 = var1.getPreviousSibling();

      while (var2 != null && var2.getLastChild() != null) {
         var2 = var2.getLastChild();
      }

      if (var2 == null) {
         var2 = var1.getParentNode();
      }

      if (var2 == this.u9) {
         var2 = null;
      }

      return var2;
   }

   private boolean u3(l0 var1) {
      if (var1.getNodeType() == 1) {
         if (this.k5 != null) {
            if (v8.n5(this.k5, this.n5) || v8.n5(var1.getName(), this.k5)) {
               return true;
            }
         } else if ((v8.n5(this.u3, this.n5) || v8.n5(var1.getLocalName(), this.u3))
            && (v8.n5(this.a6, this.n5) || com.aspose.slides.ms.System.d1.a6(var1.getNamespaceURI(), this.a6))) {
            return true;
         }
      }

      return false;
   }

   private l0 n5(l0 var1, boolean var2) {
      l0 var3 = var1;

      do {
         if (var2) {
            var3 = this.l6(var3);
         } else {
            var3 = this.k5(var3);
         }
      } while (var3 != null && !this.u3(var3));

      return var3;
   }

   private l0 n5(l0 var1, boolean var2, int var3) {
      l0 var4 = var1;

      for (int var5 = 0; var5 < var3; var5++) {
         var4 = this.n5(var4, var2);
         if (var4 == null) {
            return null;
         }
      }

      return var4;
   }

   public final l0 n5(l0 var1) {
      if (this.t2) {
         return null;
      }

      l0 var2 = var1 == null ? this.u9 : var1;
      return this.n5(var2, true);
   }

   @Override
   public l0 n5(int var1) {
      if (this.u9 == null || var1 < 0) {
         return null;
      }

      if (this.t2) {
         return null;
      }

      if (this.h0 == var1) {
         return this.c8;
      }

      int var2 = var1 - this.h0;
      boolean var3 = var2 > 0;
      if (var2 < 0) {
         var2 = -var2;
      }

      l0 var4;
      if ((var4 = this.n5(this.c8, var3, var2)) != null) {
         this.h0 = var1;
         this.c8 = var4;
         return this.c8;
      } else {
         return null;
      }
   }

   @Override
   public int n5() {
      if (this.t2) {
         return 0;
      }

      if (this.x8 < 0) {
         int var1 = 0;
         int var2 = this.l6;
         l0 var3 = this.u9;

         while ((var3 = this.n5(var3, true)) != null) {
            var1++;
         }

         if (var2 != this.l6) {
            return var1;
         }

         this.x8 = var1;
      }

      return this.x8;
   }

   @Override
   public IEnumerator iterator() {
      return this.t2 ? new r7(this) : new r6(this);
   }

   @Override
   protected void k5() {
      com.aspose.slides.ms.System.e5.n5(this);
      this.n5(true);
   }

   protected void n5(boolean var1) {
      if (this.n3 != null) {
         r5 var2 = (r5)this.n3.n5();
         if (var2 != null) {
            var2.n5();
         }

         this.n3 = null;
      }
   }
}
