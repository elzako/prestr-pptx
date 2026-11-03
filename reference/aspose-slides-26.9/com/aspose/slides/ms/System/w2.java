package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public class w2 implements v4 {
   private int n5;
   private String l6;
   private b5 k5;
   private String u3;

   public w2(int var1, b5 var2) {
      this(var1, var2, null);
   }

   public w2(int var1, b5 var2, String var3) {
      if (var1 < 0 || var1 > 8) {
         throw new ArgumentException("Illegal platform Id");
      }

      if (var2 == null) {
         throw new ArgumentNullException("version");
      }

      this.n5 = var1;
      this.k5 = (b5)var2.deepClone();
      this.l6 = var3;
   }

   @Override
   public Object deepClone() {
      return new w2(this.n5, this.k5);
   }

   public int n5() {
      return this.n5;
   }

   public String l6() {
      if (this.u3 == null) {
         String var1;
         switch (this.n5) {
            case 0:
               var1 = "Microsoft Win32S ";
               break;
            case 1:
               if (this.k5.n5() <= 4 && (this.k5.n5() != 4 || this.k5.l6() <= 0)) {
                  var1 = "Microsoft Windows 95 ";
               } else {
                  var1 = "Microsoft Windows 98 ";
               }
               break;
            case 2:
               var1 = "Microsoft Windows NT ";
               break;
            case 3:
               var1 = "Microsoft Windows CE ";
               break;
            case 4:
            case 128:
               var1 = "Unix ";
               break;
            case 5:
               var1 = "XBox ";
               break;
            case 6:
               var1 = "Mac OS X ";
               break;
            case 7:
               var1 = "Mac OS ";
               break;
            case 8:
               var1 = "IBM ";
               break;
            default:
               var1 = "<unknown> ";
         }

         if (d1.n5(this.l6)) {
            this.u3 = var1 + this.k5.toString();
         } else {
            this.u3 = var1 + this.k5.n5(2) + " " + this.l6;
         }
      }

      return this.u3;
   }

   @Override
   public String toString() {
      return this.l6();
   }
}
