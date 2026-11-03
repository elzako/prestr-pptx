package com.aspose.slides.internal.k0b;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o2b.z8;
import com.aspose.slides.internal.t2d.k5;
import com.aspose.slides.ms.System.IDisposable;

public class n5 {
   private z8 n5;
   private com.aspose.slides.internal.t2d.n5 l6;
   private boolean k5 = true;

   public n5(z8 var1, com.aspose.slides.internal.t2d.n5 var2, boolean var3) {
      if (var1 == null) {
         throw new ArgumentNullException("builder");
      }

      this.k5 = var3;
      this.n5 = var1;
      this.l6 = var2 != null ? var2 : new k5();
   }

   public final void n5(com.aspose.slides.internal.f2i.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("imageOptions");
      }

      IGenericList var2 = this.l6.n5();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            int var4 = com.aspose.slides.internal.v6g.k5.u3(var3.next(), int.class);
            if (!this.k5 || !var1.n5(var4)) {
               switch (var4) {
                  case 254:
                     this.n5.q0();
                     break;
                  case 255:
                     this.n5.z3();
                     break;
                  case 256:
                     this.n5.l6();
                     break;
                  case 257:
                     this.n5.k5();
                     break;
                  case 258:
                     this.n5.u3();
                     break;
                  case 259:
                     this.n5.a6();
                     break;
                  case 262:
                     this.n5.u9();
                     break;
                  case 263:
                     this.n5.m1();
                     break;
                  case 264:
                     this.n5.k7();
                     break;
                  case 265:
                     this.n5.m3();
                     break;
                  case 266:
                     this.n5.z8();
                     break;
                  case 269:
                     this.n5.j5();
                     break;
                  case 270:
                     this.n5.w1();
                     break;
                  case 271:
                     this.n5.r4();
                     break;
                  case 272:
                     this.n5.c4();
                     break;
                  case 273:
                     this.n5.h0();
                     break;
                  case 274:
                     this.n5.y2();
                     break;
                  case 277:
                     this.n5.e2();
                     break;
                  case 278:
                     this.n5.c8();
                     break;
                  case 279:
                     this.n5.t2();
                     break;
                  case 280:
                     this.n5.y1();
                     break;
                  case 281:
                     this.n5.a0();
                     break;
                  case 282:
                     this.n5.s7();
                     break;
                  case 283:
                     this.n5.x8();
                     break;
                  case 284:
                     this.n5.d2();
                     break;
                  case 285:
                     this.n5.d5();
                     break;
                  case 286:
                     this.n5.s3();
                     break;
                  case 287:
                     this.n5.p8();
                     break;
                  case 288:
                     this.n5.f2();
                     break;
                  case 289:
                     this.n5.i1();
                     break;
                  case 290:
                     this.n5.e5();
                     break;
                  case 291:
                     this.n5.b3();
                     break;
                  case 292:
                     this.n5.o0();
                     break;
                  case 293:
                     this.n5.z7();
                     break;
                  case 296:
                     this.n5.n3();
                     break;
                  case 297:
                     this.n5.v4();
                     break;
                  case 300:
                     this.n5.u6();
                     break;
                  case 301:
                     this.n5.t1();
                     break;
                  case 305:
                     this.n5.a5();
                     break;
                  case 306:
                     this.n5.h2();
                     break;
                  case 315:
                     this.n5.v0();
                     break;
                  case 316:
                     this.n5.f0();
                     break;
                  case 317:
                     this.n5.a3();
                     break;
                  case 318:
                     this.n5.p3();
                     break;
                  case 319:
                     this.n5.x9();
                     break;
                  case 320:
                     this.n5.y4();
                     break;
                  case 321:
                     this.n5.y0();
                     break;
                  case 322:
                     this.n5.j9();
                     break;
                  case 323:
                     this.n5.z6();
                     break;
                  case 324:
                     this.n5.e9();
                     break;
                  case 325:
                     this.n5.o5();
                     break;
                  case 326:
                     this.n5.j8();
                     break;
                  case 327:
                     this.n5.w2();
                     break;
                  case 328:
                     this.n5.s0();
                     break;
                  case 330:
                     this.n5.v8();
                     break;
                  case 332:
                     this.n5.v3();
                     break;
                  case 333:
                     this.n5.g7();
                     break;
                  case 334:
                     this.n5.j4();
                     break;
                  case 336:
                     this.n5.i9();
                     break;
                  case 337:
                     this.n5.f5();
                     break;
                  case 338:
                     this.n5.j3();
                     break;
                  case 339:
                     this.n5.n1();
                     break;
                  case 340:
                     this.n5.p6();
                     break;
                  case 341:
                     this.n5.d1();
                     break;
                  case 342:
                     this.n5.s4();
                     break;
                  case 343:
                     this.n5.h6();
                     break;
                  case 344:
                     this.n5.y8();
                     break;
                  case 345:
                     this.n5.c3();
                     break;
                  case 346:
                     this.n5.l4();
                     break;
                  case 347:
                     this.n5.i6();
                     break;
                  case 351:
                     this.n5.a7();
                     break;
                  case 512:
                     this.n5.r8();
                     break;
                  case 513:
                     this.n5.r1();
                     break;
                  case 514:
                     this.n5.y5();
                     break;
                  case 515:
                     this.n5.k8();
                     break;
                  case 517:
                     this.n5.b5();
                     break;
                  case 518:
                     this.n5.u8();
                     break;
                  case 519:
                     this.n5.w5();
                     break;
                  case 520:
                     this.n5.q1();
                     break;
                  case 521:
                     this.n5.u5();
                     break;
                  case 529:
                     this.n5.w8();
                     break;
                  case 530:
                     this.n5.c2();
                     break;
                  case 531:
                     this.n5.t3();
                     break;
                  case 532:
                     this.n5.u4();
                     break;
                  case 700:
                     this.n5.s9();
                     break;
                  case 32781:
                     this.n5.p7();
                     break;
                  case 32953:
                     this.n5.z5();
                     break;
                  case 33432:
                     this.n5.h5();
                     break;
                  case 34665:
                     this.n5.f4();
                     break;
                  case 34675:
                     this.n5.a8();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
