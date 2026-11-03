package com.aspose.slides.internal.w1;

import com.aspose.slides.internal.z8.j5;

public class l6 extends j5 {
   public l6(String var1) {
      super(var1, true);
   }

   @Override
   protected void a6() {
      label38:
      switch (this.n5) {
         case -1:
            this.l6 = -1;
            return;
         case 32:
            this.a6();
            return;
         case 43:
            this.l6 = 1;
            this.l6();
            return;
         case 45:
            this.l6 = 2;
            this.l6();
            return;
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            this.c8();
            return;
         case 69:
         case 101:
            switch (this.l6()) {
               case 86:
               case 118:
                  switch (this.l6()) {
                     case 69:
                     case 101:
                        switch (this.l6()) {
                           case 78:
                           case 110:
                              this.l6();
                              if (this.n5 == -1) {
                                 this.l6 = 6;
                              }

                              return;
                        }
                  }
               default:
                  break label38;
            }
         case 78:
         case 110:
            this.l6 = 4;
            this.l6();
            return;
         case 79:
         case 111:
            switch (this.l6()) {
               case 68:
               case 100:
                  switch (this.l6()) {
                     case 68:
                     case 100:
                        this.l6();
                        if (this.n5 == -1) {
                           this.l6 = 5;
                        }

                        return;
                  }
            }
      }

      this.l6 = 0;
   }

   private void c8() {
      while (true) {
         boolean var1 = false;
         switch (this.l6()) {
            default:
               var1 = true;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
               if (var1) {
                  this.l6 = 3;
                  return;
               }
         }
      }
   }

   @Override
   protected int u9() {
      if (this.n5 == -1) {
         return 0;
      }

      switch (this.l6) {
         case 1:
         case 2:
         case 3:
         case 4:
            return 1;
         case 5:
            return 3;
         case 6:
            return 4;
         default:
            return super.u9();
      }
   }
}
