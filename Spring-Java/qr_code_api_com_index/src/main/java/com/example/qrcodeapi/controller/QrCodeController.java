
package com.example.qrcodeapi.controller;

import com.example.qrcodeapi.util.QrCodeUtil;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/qrcode")
public class QrCodeController {

    @PostMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> generateQrCode(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        try {
            byte[] qrImage = QrCodeUtil.generateQRCodeImage(text, 300, 300);
            return ResponseEntity.ok().body(qrImage);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
