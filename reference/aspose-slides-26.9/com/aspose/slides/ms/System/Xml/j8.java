package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.ms.System.IDisposable;

public class j8 extends v9 {
   private v9 n5;
   private boolean l6;
   private Dictionary<k6, Integer> k5;
   private u9 u3;
   private k6 a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private String s7;
   private String x8;
   private int n3;

   public j8(v9 var1, y7 var2) {
      this.n5 = var1;
      this.s7 = var2.z3();
      this.x8 = var2.m1();
      if (var2.y4() == 0) {
         if (this.s7 != null) {
            this.u9 = true;
            this.h0 = true;
         }

         if (var2.m3() && var2.k7() == 1) {
            this.h0 = true;
         }

         if (var2.t9().size() > 0) {
            this.u3 = new u9();
            this.k5 = new Dictionary<>();
            this.a6 = new k6();
            List$Enumerator var3 = var2.t9().iterator();

            try {
               while (var3.hasNext()) {
                  k6 var4 = (k6)var3.next();
                  this.k5.set_Item(var4, 0);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }

            this.u3.n5(false);
         }
      } else if (var2.y4() == 1 && (this.s7 != null || this.x8 != null)) {
         this.u9 = true;
      }
   }

   @Override
   public void n5(a3 var1) {
      this.f2 = var1;
      this.n5.n5(var1);
   }

   @Override
   public void n5(int var1) {
      this.n5.n5(var1);
   }

   @Override
   public void n5(String var1) {
      this.n5.n5(var1);
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      if (this.x8 == null && this.s7 == null) {
         this.n5.n5(var1, var2, var3, var4);
      }
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      this.y4();
      if (this.h0) {
         if (this.n3 == 0 && this.c8) {
            throw new XmlException("Document cannot have multiple document elements.", com.aspose.slides.ms.System.d1.n5);
         }

         this.n3++;
         this.c8 = true;
      }

      if (this.u9) {
         this.n5.n5(var1.length() != 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{var1, ":", var2}) : var2, this.x8, this.s7, null);
         this.u9 = false;
      }

      this.n5.n5(var1, var2, var3);
      if (this.k5 != null) {
         this.a6.l6(var2, var3);
         this.u3.n5(this.k5.containsKey(this.a6));
      }
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      this.y4();
      this.n5.l6(var1, var2, var3);
      if (this.h0) {
         this.n3--;
      }

      if (this.k5 != null) {
         this.u3.n5();
      }
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      this.y4();
      this.n5.k5(var1, var2, var3);
      if (this.h0) {
         this.n3--;
      }

      if (this.k5 != null) {
         this.u3.n5();
      }
   }

   @Override
   public void n5() {
      this.n5.n5();
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      this.t2 = true;
      this.n5.u3(var1, var2, var3);
   }

   @Override
   public void l6() {
      this.t2 = false;
      this.n5.l6();
   }

   @Override
   public void l6(String var1, String var2) {
      this.n5.l6(var1, var2);
   }

   @Override
   public boolean aa_() {
      return this.n5.aa_();
   }

   @Override
   public void u3(String var1) {
      this.n5.u3(var1);
   }

   @Override
   public void u3() {
      this.n5.u3();
   }

   @Override
   public void a6(String var1) {
      this.n5.a6(var1);
   }

   @Override
   public void u9(String var1) {
      this.y4();
      this.n5.u9(var1);
   }

   @Override
   public void n5(String var1, String var2) {
      this.y4();
      this.n5.n5(var1, var2);
   }

   @Override
   public void h0(String var1) {
      if (this.t2 || !this.l6 && !this.h0()) {
         this.n5.h0(var1);
      } else {
         this.n5.a6(var1);
      }
   }

   @Override
   public void l6(String var1) {
      if (this.t2 || !this.l6 && !this.h0()) {
         this.n5.l6(var1);
      } else {
         this.n5.a6(var1);
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      if (this.t2 || !this.l6 && !this.h0()) {
         this.n5.n5(var1, var2, var3);
      } else {
         this.n5.a6(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
      }
   }

   @Override
   public void k5(String var1) {
      this.y4();
      this.n5.k5(var1);
   }

   @Override
   public void n5(char var1) {
      this.y4();
      this.n5.n5(var1);
   }

   @Override
   public void n5(char var1, char var2) {
      this.y4();
      this.n5.n5(var1, var2);
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      if (this.t2 || !this.l6 && !this.h0()) {
         this.n5.a_(var1, var2, var3);
      } else {
         this.n5.a6(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
      }
   }

   @Override
   public void c8(String var1) {
      if (this.t2 || !this.l6 && !this.h0()) {
         this.n5.c8(var1);
      } else {
         this.n5.a6(var1);
      }
   }

   @Override
   public void a6() {
      this.n5.a6();
      if (this.h0 && !this.c8) {
         throw new XmlException("Document does not have a root element.", com.aspose.slides.ms.System.d1.n5);
      }
   }

   @Override
   public void u9() {
      this.n5.u9();
   }

   private boolean h0() {
      if (this.k5 != null && this.u3.l6()) {
         this.l6 = true;
         return true;
      } else {
         return false;
      }
   }

   private void y4() {
      this.l6 = false;
   }
}
