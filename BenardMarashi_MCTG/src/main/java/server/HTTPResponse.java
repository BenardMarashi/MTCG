package main.java.server;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HTTPResponse{
    public Object ResponseObject;
    public String Status;
}