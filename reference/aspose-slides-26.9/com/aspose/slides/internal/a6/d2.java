package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class d2 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "inline",
      "block",
      "list-item",
      "inline-block",
      "run-in",
      "compact",
      "table",
      "inline-table",
      "table-row-group",
      "table-header-group",
      "table-footer-group",
      "table-row",
      "table-column-group",
      "table-column",
      "table-cell",
      "table-caption",
      "ruby",
      "ruby-base",
      "ruby-text",
      "ruby-base-group",
      "ruby-text-group",
      "grid",
      "inline-grid",
      "none"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "inline";
         case 1:
            return "block";
         case 2:
            return "list-item";
         case 3:
            return "inline-block";
         case 4:
            return "run-in";
         case 5:
            return "compact";
         case 6:
            return "table";
         case 7:
            return "inline-table";
         case 8:
            return "table-row-group";
         case 9:
            return "table-header-group";
         case 10:
            return "table-footer-group";
         case 11:
            return "table-row";
         case 12:
            return "table-column-group";
         case 13:
            return "table-column";
         case 14:
            return "table-cell";
         case 15:
            return "table-caption";
         case 16:
            return "ruby";
         case 17:
            return "ruby-base";
         case 18:
            return "ruby-text";
         case 19:
            return "ruby-base-group";
         case 20:
            return "ruby-text-group";
         case 21:
            return "none";
         case 22:
            return "grid";
         case 23:
            return "inline-grid";
         default:
            throw new ArgumentException("value");
      }
   }

   @Override
   public boolean n5(String var1, int[] var2) {
      switch (n5.n5(com.aspose.slides.ms.System.d1.u9(var1))) {
         case 0:
            var2[0] = 0;
            return true;
         case 1:
            var2[0] = 1;
            return true;
         case 2:
            var2[0] = 2;
            return true;
         case 3:
            var2[0] = 3;
            return true;
         case 4:
            var2[0] = 4;
            return true;
         case 5:
            var2[0] = 5;
            return true;
         case 6:
            var2[0] = 6;
            return true;
         case 7:
            var2[0] = 7;
            return true;
         case 8:
            var2[0] = 8;
            return true;
         case 9:
            var2[0] = 9;
            return true;
         case 10:
            var2[0] = 10;
            return true;
         case 11:
            var2[0] = 11;
            return true;
         case 12:
            var2[0] = 12;
            return true;
         case 13:
            var2[0] = 13;
            return true;
         case 14:
            var2[0] = 14;
            return true;
         case 15:
            var2[0] = 15;
            return true;
         case 16:
            var2[0] = 16;
            return true;
         case 17:
            var2[0] = 17;
            return true;
         case 18:
            var2[0] = 18;
            return true;
         case 19:
            var2[0] = 19;
            return true;
         case 20:
            var2[0] = 20;
            return true;
         case 21:
            var2[0] = 22;
            return true;
         case 22:
            var2[0] = 23;
            return true;
         case 23:
            var2[0] = 21;
            return true;
         default:
            throw new ArgumentException("token");
      }
   }
}
