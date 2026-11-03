package com.aspose.slides.internal.h3;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.internal.z4.t2;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class a6 extends u9 {
   private final String n5;
   private IGenericDictionary<String, t2> l6;
   private boolean k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("NextPage", "PreviousPage", "FirstPage", "LastPage");

   public a6(String var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(s3 var1) {
      if (this.l6()) {
         int var2 = 1;
         switch (a6.n5(this.n5)) {
            case 0:
               var2 = this.k5() + 1;
               break;
            case 1:
               var2 = this.k5() - 1;
               break;
            case 2:
               var2 = 1;
               break;
            case 3:
               this.n5(this.n5().size());
               break;
            default:
               this.n5(1);
         }

         if (var2 < 1 || var2 > this.n5().size()) {
            var2 = 1;
         }

         t2 var3 = this.n5().get_Item(a3.l6(var2));
         var1.n5("/Dest ");
         var3.n5(var1);
      } else {
         var1.n5("/A");
         var1.c8();
         var1.k5("/Type", "/Action");
         var1.k5("/S", "/Named");
         var1.k5("/N", d1.n5(new String[]{"/", this.n5}));
         var1.t2();
      }
   }

   public final IGenericDictionary<String, t2> n5() {
      return this.l6;
   }

   public final void n5(IGenericDictionary<String, t2> var1) {
      this.l6 = var1;
   }

   public final boolean l6() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public static a6 u3() {
      return new a6("NextPage");
   }

   public static a6 a6() {
      return new a6("PrevPage");
   }

   public static a6 u9() {
      return new a6("FirstPage");
   }

   public static a6 h0() {
      return new a6("LastPage");
   }

   public static a6 c8() {
      return new a6("GoBack");
   }
}
