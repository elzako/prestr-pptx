package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class x6 extends com.aspose.slides.internal.x6s.u3 implements com.aspose.slides.ms.System.v4 {
   private j9e n5;
   private Object l6;
   private int k5;
   private x6$l6 u3 = new x6$l6();
   private x6$n5 a6;

   public x6(j9e var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.k5 = 3;
      this.u3.n5 = var2;
   }

   public x6(j9e var1, com.aspose.slides.ms.System.j5 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.k5 = 16;
      var2.u3(this.u3.a6);
   }

   public x6(j9e var1, double var2) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.k5 = 14;
      this.u3.l6 = var2;
   }

   public x6(j9e var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.k5 = 9;
      this.u3.u3 = var2;
   }

   public x6(j9e var1, long var2) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.k5 = 11;
      this.u3.k5 = var2;
   }

   public x6(j9e var1, String var2) {
      if (var2 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.l6 = var2;
   }

   public x6(j9e var1, String var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var2 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.l6 = var2;
      if (var3 != null && (this.n5.o0() == 29 || this.n5.o0() == 30)) {
         String var4 = this.n5(var2);
         this.a6 = new x6$n5(var4, var3.n5(var4));
      }
   }

   public x6(j9e var1, Object var2) {
      if (var2 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.l6 = var2;
   }

   public x6(j9e var1, Object var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var2 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1 == null) {
         throw new ArgumentNullException("xmlType");
      }

      this.n5 = var1;
      this.l6 = var2;
      if (var3 != null && (this.n5.o0() == 29 || this.n5.o0() == 30)) {
         com.aspose.slides.ms.System.Xml.k6 var4 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.ms.System.Xml.k6.class);
         String var5 = var4.n5();
         this.a6 = new x6$n5(var3.l6(var5), var5);
      }
   }

   public final x6 n5() {
      return this;
   }

   public j9e l6() {
      return this.n5;
   }

   public com.aspose.slides.ms.System.y8 k5() {
      return this.n5.b3().s7();
   }

   public Object u3() {
      e3m var1 = this.n5.z7();
      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return var1.n5(this.u3.n5, this.k5());
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return var1.n5(this.u3.u3, this.k5());
            case 11:
               return var1.n5(this.u3.k5, this.k5());
            case 14:
               return var1.n5(this.u3.l6, this.k5());
            case 16:
               return var1.n5(this.u3.a6.m3(), this.k5());
         }
      }

      return var1.n5(this.l6, this.k5(), this.a6);
   }

   public boolean a6() {
      e3m var1 = this.n5.z7();
      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return this.u3.n5;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return var1.n5(this.u3.u3);
            case 11:
               return var1.n5(this.u3.k5);
            case 14:
               return var1.n5(this.u3.l6);
            case 16:
               return var1.n5(this.u3.a6.m3());
         }
      }

      return var1.n5(this.l6);
   }

   public com.aspose.slides.ms.System.j5 u9() {
      e3m var1 = this.n5.z7();
      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return var1.n5(this.u3.n5);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return var1.l6(this.u3.u3);
            case 11:
               return var1.l6(this.u3.k5);
            case 14:
               return var1.l6(this.u3.l6);
            case 16:
               return this.u3.a6;
         }
      }

      return var1.l6(this.l6);
   }

   public double h0() {
      e3m var1 = this.n5.z7();
      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return var1.l6(this.u3.n5);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return var1.k5(this.u3.u3);
            case 11:
               return var1.k5(this.u3.k5);
            case 14:
               return this.u3.l6;
            case 16:
               return var1.k5(this.u3.a6.m3());
         }
      }

      return var1.a6(this.l6);
   }

   public int t2() {
      e3m var1 = this.n5.z7();
      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return var1.k5(this.u3.n5);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return this.u3.u3;
            case 11:
               return var1.u3(this.u3.k5);
            case 14:
               return var1.k5(this.u3.l6);
            case 16:
               return var1.u3(this.u3.a6.m3());
         }
      }

      return var1.u9(this.l6);
   }

   public long s7() {
      e3m var1 = this.n5.z7();
      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return var1.u3(this.u3.n5);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return var1.u3(this.u3.u3);
            case 11:
               return this.u3.k5;
            case 14:
               return var1.u3(this.u3.l6);
            case 16:
               return var1.a6(this.u3.a6.m3());
         }
      }

      return var1.h0(this.l6);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.y8 var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      e3m var3 = this.n5.z7();
      if (var1 == com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.x6s.u3.class) || var1 == com.aspose.slides.internal.v6g.k5.n5(x6.class)) {
         return this;
      }

      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return var3.n5(this.u3.n5, var1);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return var3.n5(this.u3.u3, var1);
            case 11:
               return var3.n5(this.u3.k5, var1);
            case 14:
               return var3.n5(this.u3.l6, var1);
            case 16:
               return var3.n5(this.u3.a6.m3(), var1);
         }
      }

      return var3.n5(this.l6, var1, var2);
   }

   @Override
   public String c8() {
      e3m var1 = this.n5.z7();
      if (this.l6 == null) {
         switch (this.k5) {
            case 3:
               return var1.a6(this.u3.n5);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            default:
               break;
            case 9:
               return var1.a6(this.u3.u3);
            case 11:
               return var1.a6(this.u3.k5);
            case 14:
               return var1.u9(this.u3.l6);
            case 16:
               return var1.u9(this.u3.a6.m3());
         }
      }

      return var1.n5(this.l6, this.a6);
   }

   @Override
   public String toString() {
      return this.c8();
   }

   private String n5(String var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      int var4 = com.aspose.slides.ms.System.Xml.y5.n5(var1, 0, var3);
      var2 = var3[0];
      if (var4 == 0 || var4 != var1.length()) {
         return null;
      } else {
         return var2 != 0 ? com.aspose.slides.ms.System.d1.l6(var1, 0, var2) : com.aspose.slides.ms.System.d1.n5;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x6 deepClone() {
      return this.n5();
   }

}
